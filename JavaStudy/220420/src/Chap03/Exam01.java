package Chap03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		String result = "";
		
		System.out.print("문자 하나를 입력하시오 ==> ");
		String temp = sc.nextLine();
		ch = temp.charAt(0);
		
		/*if('0'<=ch && ch<='9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){
			System.out.println("입력하신 문자는 영문자입니다.");
		} */
		
		result = (ch >= '0' && ch <='9') ? "숫자"	: "문자";
		System.out.println(result);

		//복합 대입 연산자
		int i = 10;
		i = i+2;
		i+=2;
		
	}

}
