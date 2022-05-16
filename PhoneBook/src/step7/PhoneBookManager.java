package step7;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	
	private static PhoneBookManager pm;
	/* final int MAX_CNT=100;
	Person[] infoStorage = new Person[MAX_CNT];
	int curCnt = 0; */
	HashSet infoStorage = new HashSet(); // HashSet �߰�
	
	private PhoneBookManager() {}
	
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
		/* infoStorage[curCnt] = tmp;
		curCnt++; */
		if(infoStorage.add(tmp)) {
		System.out.println("�Է¿Ϸ�");
		}else{
			System.out.println("�Է½��� : �ߺ��� �ڷ�");
		}
	}
	
	void allDisplay() {
		/* for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		} */
		Iterator it = infoStorage.iterator();
		
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
		
		/*
		if(index > -1) {		//�˻� ������ ��� ���
			infoStorage[index].showPhoneInfo();
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		} */
		
	}
	
	private Person search(String name) { //int�� Person���� ����
		Iterator it = infoStorage.iterator();
		while(it.hasNext()) {
			Person tmp = (Person)it.next();
			if(name.equals(tmp.name))
				return tmp;
		}
		return null;
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//index = infoStorage[i]; //i�� ��ü �ּҸ� index�� ����
				return i;
			}
		}
		return -1;
		*/
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
		//index = search(name);
		Iterator it = infoStorage.iterator(); //�迭���� ���� ����
		while(it.hasNext()) {
			tmp = (Person)it.next();
			if(name.equals(tmp.name)) {
				it.remove();
				System.out.println("�����Ϸ�");
				return;
			}
		}
		System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		/*
		if(index > -1) {//������ ������ ã������
			for(int i=index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];	
			}
			curCnt--;
			System.out.println("�����Ϸ�");
			
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}*/

	}
}
