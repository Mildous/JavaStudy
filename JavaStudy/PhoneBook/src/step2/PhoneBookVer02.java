package step2;

import java.util.Scanner;

public class PhoneBookVer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� ==> ");
		String name = sc.nextLine();
		System.out.print("���� ==> ");
		String phoneNumber = sc.nextLine();
		System.out.print("���� ==> ");
		String birth = sc.nextLine();
		
		Person p = new Person(name, phoneNumber, birth);
		
		p.showPhoneInfo();

	}
}
