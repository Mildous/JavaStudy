package step8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	
	private static PhoneBookManager pm;

	HashSet<Person> infoStorage = new HashSet<Person>(); // HashSet �߰�
	File dataFile = new File("Person.dat");
	
	private PhoneBookManager() {
		readFile();
	}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
		}
	
	private Person readNomalPerson() {
		System.out.print("�̸� ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);
	}
	
	private Person readUnivPerson() {
		System.out.print("�̸� ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String birth = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String major = MenuViewer.sc.nextLine();
		System.out.print("�г� ==> ");
		int grade = Integer.parseInt(MenuViewer.sc.nextLine());
		
		return new UnivPerson(name, phoneNumber, birth, major, grade);
	}
	
	private Person readCompPerson() {
		System.out.print("�̸� ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String birth = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String company = MenuViewer.sc.nextLine();
		
		return new CompPerson(name, phoneNumber, birth, company);
	}
	
	void inputData() throws MenuChoiceException {
		
		System.out.print("1.�Ϲ�, 2.����, 3.ȸ�� ==> ");
		int choice = Integer.parseInt(MenuViewer.sc.nextLine());
		
		if(choice < SubMenu.NOMAL || choice > SubMenu.COMPANY)
			throw new MenuChoiceException(choice);
		
		Person tmp = null;
		
		switch(choice) {
		case SubMenu.NOMAL :
			tmp = readNomalPerson();
			break;
			
		case SubMenu.UNIV :
			tmp = readUnivPerson();
			break;
		
		case SubMenu.COMPANY :
			tmp = readCompPerson();
			break;
		}

		if(infoStorage.add(tmp)) {
		System.out.println("�Է¿Ϸ�");
		}else{
			System.out.println("�Է½��� : �ߺ��� �ڷ�");
		}
	}
	
	void allDisplay() {
	
		Iterator<Person> it = infoStorage.iterator();
		
		while(it.hasNext()) {
			Person tmp = (Person)it.next();
			tmp.showPhoneInfo();
		}
	}
	void searchData() {
		System.out.print("�˻��� �̸���? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null;
		//int index = -1;
		//index = search(name);
		tmp = search(name);
		
		if(tmp!=null) {
			tmp.showPhoneInfo();
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}

	}
	
	private Person search(String name) { //int�� Person���� ����
		Iterator<Person> it = infoStorage.iterator();
		while(it.hasNext()) {
			Person tmp = (Person)it.next();
			if(name.equals(tmp.name))
				return tmp;
		}
		return null;

	}
	
	void updateData() {
		//1. ������ �̸� ã�� --> �迭�� ��ġ ã��
		System.out.print("������ �̸���? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null; //int index = -1;
		tmp = search(name); //index = search(name);

		
		//2. ����, ������ ���� �Է¹޾Ƽ� �����ϱ�
		if(tmp!=null) { //if(index>-1) {
			System.out.print("������ ���� ==> ");
			tmp.phoneNumber = MenuViewer.sc.nextLine();//String -> tmp.
			System.out.print("������ ���� ==> "); 
			tmp.birth = MenuViewer.sc.nextLine();//String -> tmp.
			//infoStorage[index].birth = birth;
			System.out.println("�����Ϸ�");
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}
		
	}
	void deleteData() {
		System.out.print("������ �̸���? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null; //int index = -1;
		tmp = search(name);
		if(tmp!=null) { //if(index>-1) {
			infoStorage.remove(tmp);
			System.out.println("�����Ϸ�");

		}else { //�˻� ���н� �޼��� ���
		System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}
	}
		
	void allDelete() {
		Iterator it = infoStorage.iterator();
		
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println("��ü���� �Ϸ�");
	
	}
	
	void saveFile() {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		
		try {
			fos = new FileOutputStream(dataFile);
			out = new ObjectOutputStream(fos);
			
			Iterator<Person> it = infoStorage.iterator();
			
			while(it.hasNext()) {
				out.writeObject(it.next());
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) out.close();
				if(fos != null) fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void readFile() {
		if(dataFile.exists()==false) {
			return;
		}
		
		FileInputStream fis = null;
		ObjectInputStream in = null;
		
		try {
			fis = new FileInputStream(dataFile);
			in = new ObjectInputStream(fis);
			
			while(true) {
				Person tmp = (Person)in.readObject();
				if(tmp==null)
					break;
				infoStorage.add(tmp);
			}
		}catch(Exception e) {
			//e.printStackTrace();
		}finally {
			try {
				if(in != null) in.close();
				if(fis != null) fis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
}
