package exam01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//입력: 이름, 주민번호(123456-1234567), 주소
		//출력: 당신의 이름은 ???입니다.
		//		당신의 나이는 ???세 입니다.
		//		당신의 성별은 ???입니다.
		//		당신의 주소는 ???입니다.
		
		Scanner s = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = s.nextLine();
		System.out.print("주민번호 : ");
		String regi = s.nextLine();
		int loc1 = regi.indexOf("-");
		int loc2 = regi.lastIndexOf("-");
		System.out.println(loc1);
		System.out.println(loc2);
		String tmp = regi;
		tmp = tmp.replace("0", "");
		tmp = tmp.replace("1", "");
		tmp = tmp.replace("2", "");
		tmp = tmp.replace("3", "");
		tmp = tmp.replace("4", "");
		tmp = tmp.replace("5", "");
		tmp = tmp.replace("6", "");
		tmp = tmp.replace("7", "");
		tmp = tmp.replace("8", "");
		tmp = tmp.replace("9", "");
		
		int regiLen = regi.length();
		
		if(regi.length() < 1 || regi.length() < 14) {
			System.out.println("잘못 입력하셨습니다.");
		} else if(!(loc1 == 6 && loc2 == 6)) {
			System.out.println("양식에 맞지 않습니다.");
		} else if(!tmp.equals("-")) {
			System.out.println("error");
		}
		System.out.print("주소 : ");
		String addr = s.nextLine();
		
		String gender = "";
		
		String imsi01 = regi.substring(7, 8);
		String imsi02_ = regi.substring(0, 2);
		
		int imsi02 = Integer.parseInt(imsi02_);
		
		if(imsi01.equals("1") || imsi01.equals("3")) {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		int bornYear = 0;
		if(imsi01.equals("1") || imsi01.equals("2")) {
			bornYear = 1900;
		} else {
			bornYear = 2000;
		}
		int age = 2022 - (bornYear + imsi02);	
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 성별은 " + gender + "입니다.");
		System.out.println("당신의 주소는 " + addr + "입니다.");	
		
	}
}
