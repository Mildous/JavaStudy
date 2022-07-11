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
		
<<<<<<< HEAD
		System.out.print("Name ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("PhoneNumber ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("Birth ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new Person(name, phoneNumber, birth);
		System.out.println("success..");
=======
		System.out.print("�̸� ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("���� ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new Person(name, phoneNumber, birth);
		System.out.println("�Է¿Ϸ�");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	void searchData() {
<<<<<<< HEAD
		System.out.print("search data.. ==> ");
=======
		System.out.print("�˻��� �̸���? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		String name = MenuViewer.sc.nextLine();
		//Person tmp = null;
		int index = -1;
		
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
				break;
			}
		}*/
		if(index > -1) {		//�˻� ������ ��� ���
			infoStorage[index].showPhoneInfo();
		}else { //�˻� ���н� �޼��� ���
			System.out.println("..");
=======
				tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
				break;
			}
		}*/
		if(index > -1) {		//�˻� ������ ��� ���
			infoStorage[index].showPhoneInfo();
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}
		
	}
	
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				//index = infoStorage[i]; //i�� ��ü �ּҸ� index�� ����
=======
				//index = infoStorage[i]; //i�� ��ü �ּҸ� index�� ����
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
				return i;
			}
		}
		return -1;
	}
	
	void updateData() {
<<<<<<< HEAD
		//1. ������ �̸� ã�� --> �迭�� ��ġ ã��
		//2. ����, ������ ���� �Է¹޾Ƽ� �����ϱ�
		System.out.print("������ �̸���? ==> ");
=======
		//1. ������ �̸� ã�� --> �迭�� ��ġ ã��
		//2. ����, ������ ���� �Է¹޾Ƽ� �����ϱ�
		System.out.print("������ �̸���? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				//tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
=======
				//tmp = infoStorage[i]; //i�� ��ü �ּҸ� tmp�� ����
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
				index = i;
				break;
			}
		
		}
		*/
<<<<<<< HEAD
		if(index>-1) {		//�˻� ������
			System.out.print("������ ���� ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("������ ���� ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = birth;
			System.out.println("�����Ϸ�");
			
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
=======
		if(index>-1) {		//�˻� ������
			System.out.print("������ ���� ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("������ ���� ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = MenuViewer.sc.nextLine();
			System.out.println("�����Ϸ�");
			
		}else { //�˻� ���н� �޼��� ���
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}
		
	}
	void deleteData() {
<<<<<<< HEAD
		System.out.print("������ �̸���? ==> ");
=======
		System.out.print("������ �̸���? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
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
<<<<<<< HEAD
		if(index > -1) {//������ ������ ã������
=======
		if(index > -1) {//������ ������ ã������
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
			for(int i=index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];	
			}
			curCnt--;
<<<<<<< HEAD
			System.out.println("�����Ϸ�");
			
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
=======
			System.out.println("�����Ϸ�");
			
		}else {
			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}

	}
}
