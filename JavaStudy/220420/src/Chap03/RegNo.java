package Chap03;

import java.util.Scanner;

public class RegNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요. (000000-0000000) : ");
		String no = sc.nextLine();
		char gen = no.charAt(7);
		
		switch(gen) {
			case '1': case '3':
				switch(gen) {
					case '1':
						System.out.println("2000년 이전 출생한 남자입니다.");
						break;
					case '3':
						System.out.println("2000년 이후 출생한 남자입니다.");
						break;
				}
			break;
			case '2': case '4':
				switch(gen) {
					case '2':
						System.out.println("2000년 이전 출생한 여자입니다.");
						break;
					case '4':
						System.out.println("2000년 이후 출생한 여자입니다.");
						break;
				}
			break;
		}
		
	}

}
