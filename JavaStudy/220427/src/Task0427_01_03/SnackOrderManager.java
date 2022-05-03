package Task0427_01_03;

public class SnackOrderManager {
	
	final int MAX_CNT=100;
	Snack[] orderStorage = new Snack[MAX_CNT];
	int curCnt = 0;
	
	//1. �Է�
	void inputOrder() {
		
		System.out.print("��� : ");
		String shape = MenuViewer.sc.nextLine();
		System.out.print("�� : ");
		String taste = MenuViewer.sc.nextLine();
		System.out.print("������� : ");
		String price = (MenuViewer.sc.nextLine());
		System.out.print("�ֹ����� : ");
		int qty = Integer.parseInt(MenuViewer.sc.nextLine());
		
		orderStorage[curCnt++] = new Snack(shape, taste, price, qty);
		System.out.println("--> �ֹ��Ϸ�");
		System.out.println();
	}
	
	//2.�˻�
	void searchOrder() {
		System.out.print("�ֹ��Ͻ� ����� �Է��ϼ���. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
			
			if(index > -1) { //�˻� ������ �Է��� �ֹ����� ���
				orderStorage[index].showSnackOrder();
			}else { //�˻� ���н�
				System.out.println("�ش� �ֹ����� �������� �ʽ��ϴ�.");
				System.out.println();
			}
		
	}
	
	private int search(String shape) {
		
		for(int i=0; i<curCnt; i++) {
			if(shape.equals(orderStorage[i].shape)) {//i�� ��ü �ּҸ� index�� ����
				return i;
			}
		}
		return -1;
	}
	
	//3.����
	void updateOrder() {
		System.out.print("�����Ͻ� �ֹ����� ����� �Է��ϼ���. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
		
		if(index > -1) { // �˻� ������ ������ �ֹ� �Է�
			System.out.print("��: ");
			String taste = MenuViewer.sc.nextLine();
			System.out.print("�������: ");
			String price = MenuViewer.sc.nextLine();
			System.out.print("����: ");
			int qty = MenuViewer.sc.nextInt();
			
			orderStorage[index].price = MenuViewer.sc.nextLine();
			System.out.println("�ش� �ֹ����� ���������� �����Ǿ����ϴ�.");
			System.out.println();
		}else {//�˻� ���н�
			System.out.println("�ش� �ֹ����� �������� �ʽ��ϴ�.");
			System.out.println();
		}
			
	}
	
	//4.����
	void deleteOrder() {
		
		System.out.print("�����Ͻ� �ֹ����� ����� �Է��ϼ���. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
		
		if(index > -1) { // �˻� ������ ����
			
			for(int i=index; i<curCnt; i++) {
				orderStorage[i] = orderStorage[i+1];
			}
			curCnt--;
			System.out.println("�ش� �ֹ����� ���������� �����Ͽ����ϴ�.");
			System.out.println();
			
		}else {//�˻� ���н�
			System.out.println("�ش� �ֹ����� �������� �ʽ��ϴ�.");
			System.out.println();
		}
		
	}
	
	//5.��ü���
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			orderStorage[i].showSnackOrder();
			System.out.println();
		}
	}
	
	
}

