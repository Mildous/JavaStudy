package Task0427_01_03;

import java.util.Scanner;

public class MenuViewer {
	static Scanner sc = new Scanner(System.in);
	
	static void showMenu() {
		System.out.println("==== MENU ====");
		System.out.println("1. 주문하기");
		System.out.println("2. 주문검색");
		System.out.println("3. 주문수정");
		System.out.println("4. 주문취소");
		System.out.println("5. 모든 주문내역 보기");
		System.out.println("6. 프로그램 종료");
		System.out.print("--> ");

	}

}
