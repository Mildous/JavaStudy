package step2;

import java.util.Scanner;

public class PhoneBookVer02_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		
		while(true) {
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1:
				inputData();
				break;
			case 2:
				System.out.println("���α׷� ����");
				return;
			}
		}
	}
	
	static void inputData() {
		
		System.out.print("�̸� ==> ");
		String name = sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = sc.nextLine();
		System.out.print("���� ==> ");
		String birth = sc.nextLine();
		
		Person p = new Person(name, phoneNumber, birth);
		p.showPhoneInfo();
	}
	
	static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("���� ==> ");
	}
}
