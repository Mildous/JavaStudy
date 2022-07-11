package Task0427_01_02;

import java.util.Scanner;

public class SnackOrderVer1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice = 0;
		
		while(true) {
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				inputOrder();
				break;
			case 2:
				System.out.println("���α׷� ����");
				return;
			}
		}
		
	}
		
	static void inputOrder() {
			
		System.out.print("��� : ");
		String shape = sc.nextLine();
		System.out.print("�� : ");
		String taste = sc.nextLine();
		System.out.print("������� : ");
		String price = (sc.nextLine());
		System.out.print("�ֹ����� : ");
		int qty = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(shape, taste, price, qty);
		
		s.showSnackOrder();
	}
	
		
	static void showMenu() {
		System.out.println("==== MENU ====");
		System.out.println("1. �ֹ��ϱ�");
		System.out.println("2. ���α׷� ����");
		System.out.print("--> ");
	}
}