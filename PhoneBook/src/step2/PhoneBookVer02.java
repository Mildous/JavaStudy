<<<<<<< HEAD
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
=======
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
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
