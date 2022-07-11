package Step6;

public class PhoneBookManager {
	
	private static PhoneBookManager pm;
	final int MAX_CNT=100;
	Person[] infoStorage = new Person[MAX_CNT];
	int curCnt = 0;
	
	private PhoneBookManager() {}
	
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
		infoStorage[curCnt] = tmp;
		curCnt++;
		System.out.println("입력완료");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	void searchData() {
		System.out.print("검색할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		//Person tmp = null;
		int index = -1;
		
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				tmp = infoStorage[i]; //i의 객체 주소를 tmp에 전달
				break;
			}
		}*/
		if(index > -1) {		//검색 성공시 결과 출력
			infoStorage[index].showPhoneInfo();
		}else { //검색 실패시 메세지 출력
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}
	
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//index = infoStorage[i]; //i의 객체 주소를 index에 전달
				return i;
			}
		}
		return -1;
	}
	
	void updateData() {
		//1. 수정할 이름 찾기 --> 배열의 위치 찾기
		//2. 전번, 생일을 새로 입력받아서 저장하기
		System.out.print("수정할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//tmp = infoStorage[i]; //i의 객체 주소를 tmp에 전달
				index = i;
				break;
			}
		
		}
		*/
		if(index>-1) {		//검색 성공시
			System.out.print("수정할 전번 ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("수정할 생일 ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = birth;
			System.out.println("수정완료");
			
		}else { //검색 실패시 메세지 출력
			System.out.println("일치하는 정보가 없습니다.");
		}
		
	}
	void deleteData() {
		System.out.print("삭제할 이름은? ==> ");
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				index = i;
				tmp = infoStorage[i];
				break;
			}
		} */
		if(index > -1) {//삭제할 정보를 찾았으면
			for(int i=index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];	
			}
			curCnt--;
			System.out.println("삭제완료");
			
		}else {
			System.out.println("일치하는 정보가 없습니다.");
		}

	}
}
