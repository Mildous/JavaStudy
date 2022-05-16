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

	HashSet<Person> infoStorage = new HashSet<Person>(); // HashSet 추가
	File dataFile = new File("Person.dat");
	
	private PhoneBookManager() {
		readFile();
	}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
		}
	
	private Person readNomalPerson() {
		System.out.print("이름 ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전번 ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("생일 ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		return new Person(name, phoneNumber, birth);
	}
	
	private Person readUnivPerson() {
		System.out.print("이름 ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전번 ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("생일 ==> ");
		String birth = MenuViewer.sc.nextLine();
		System.out.print("전공 ==> ");
		String major = MenuViewer.sc.nextLine();
		System.out.print("학년 ==> ");
		int grade = Integer.parseInt(MenuViewer.sc.nextLine());
		
		return new UnivPerson(name, phoneNumber, birth, major, grade);
	}
	
	private Person readCompPerson() {
		System.out.print("이름 ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전번 ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("생일 ==> ");
		String birth = MenuViewer.sc.nextLine();
		System.out.print("전공 ==> ");
		String company = MenuViewer.sc.nextLine();
		
		return new CompPerson(name, phoneNumber, birth, company);
	}
	
	void inputData() throws MenuChoiceException {
		
		System.out.print("1.일반, 2.대학, 3.회사 ==> ");
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
		System.out.println("입력완료");
		}else{
			System.out.println("입력실패 : 중복된 자료");
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
		System.out.print("검색할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null;
		//int index = -1;
		//index = search(name);
		tmp = search(name);
		
		if(tmp!=null) {
			tmp.showPhoneInfo();
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}

	}
	
	private Person search(String name) { //int를 Person으로 변경
		Iterator<Person> it = infoStorage.iterator();
		while(it.hasNext()) {
			Person tmp = (Person)it.next();
			if(name.equals(tmp.name))
				return tmp;
		}
		return null;

	}
	
	void updateData() {
		//1. 수정할 이름 찾기 --> 배열의 위치 찾기
		System.out.print("수정할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null; //int index = -1;
		tmp = search(name); //index = search(name);

		
		//2. 전번, 생일을 새로 입력받아서 저장하기
		if(tmp!=null) { //if(index>-1) {
			System.out.print("수정할 전번 ==> ");
			tmp.phoneNumber = MenuViewer.sc.nextLine();//String -> tmp.
			System.out.print("수정할 생일 ==> "); 
			tmp.birth = MenuViewer.sc.nextLine();//String -> tmp.
			//infoStorage[index].birth = birth;
			System.out.println("수정완료");
		}else { //검색 실패시 메세지 출력
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}
	void deleteData() {
		System.out.print("삭제할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		Person tmp = null; //int index = -1;
		tmp = search(name);
		if(tmp!=null) { //if(index>-1) {
			infoStorage.remove(tmp);
			System.out.println("삭제완료");

		}else { //검색 실패시 메세지 출력
		System.out.println("일치하는 정보가 없습니다.");
		}
	}
		
	void allDelete() {
		Iterator it = infoStorage.iterator();
		
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println("전체삭제 완료");
	
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
