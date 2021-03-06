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
				System.out.println("프로그램 종료");
				return;
			}
		}
		
	}
		
	static void inputOrder() {
			
		System.out.print("모양 : ");
		String shape = sc.nextLine();
		System.out.print("맛 : ");
		String taste = sc.nextLine();
		System.out.print("희망가격 : ");
		String price = (sc.nextLine());
		System.out.print("주문수량 : ");
		int qty = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(shape, taste, price, qty);
		
		s.showSnackOrder();
	}
	
		
	static void showMenu() {
		System.out.println("==== MENU ====");
		System.out.println("1. 주문하기");
		System.out.println("2. 프로그램 종료");
		System.out.print("--> ");
	}
}
