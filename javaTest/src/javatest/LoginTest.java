package javatest;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		String userId = "";
		String userPw = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input your ID.. ");
		userId = sc.nextLine();
		System.out.println("input your Password");
		userPw = sc.nextLine();
		
		if(userId.equals("hong") && userPw.equals("1234")) {
			System.out.println("welcome world..");
		} else {
			System.out.println("can not found your id or pw..");
		}
	}
}
