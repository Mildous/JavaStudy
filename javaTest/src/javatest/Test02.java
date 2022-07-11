package javatest;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 입력: 아이디, 출력: 아이디, 조건: q
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true) {
			System.out.println("input your ID..");
			id = sc.nextLine();
			id = id.trim();
			
			if(id.equals(" ")) {
				System.out.println("Do not use backspace..");
				continue;
			} else if(id.equals("")) {
				System.out.println("please input your ID..");
				continue;
			}else if(id.equalsIgnoreCase("q")) {
				break;
			}
			System.out.println("your ID is.. " + id);
		}
		System.out.println("exit..");
	}
}
