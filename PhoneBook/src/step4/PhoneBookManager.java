package step4;

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
	
	void inputData() {
		
		System.out.print("Name ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("PhoneNumber ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("Birth ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new Person(name, phoneNumber, birth);
		System.out.println("success..");
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	void searchData() {
		System.out.print("search data.. ==> ");
		String name = MenuViewer.sc.nextLine();
		//Person tmp = null;
		int index = -1;
		
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
				break;
			}
		}*/
		if(index > -1) {		//�˻� ������ ��� ���
			infoStorage[index].showPhoneInfo();
		}else { //�˻� ���н� �޼��� ���
			System.out.println("..");
		}
		
	}
	
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//index = infoStorage[i]; //i�� ��ü �ּҸ� index�� ����
				return i;
			}
		}
		return -1;
	}
	
	void updateData() {
		//1. ������ �̸� ã�� --> �迭�� ��ġ ã��
		//2. ����, ������ ���� �Է¹޾Ƽ� �����ϱ�
		System.out.print("������ �̸���? ==> ");
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				//tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
				index = i;
				break;
			}
		
		}
		*/
		if(index>-1) {		//�˻� ������
			System.out.print("������ ���� ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("������ ���� ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = birth;
			System.out.println("�����Ϸ�");
			
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}
		
	}
	void deleteData() {
		System.out.print("������ �̸���? ==> ");
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
		if(index > -1) {//������ ������ ã������
			for(int i=index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];	
			}
			curCnt--;
			System.out.println("�����Ϸ�");
			
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
		}

	}
}
