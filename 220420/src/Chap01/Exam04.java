package Chap01;

import java.util.Scanner;

public class Exam04 {
	/* 성별이 여자이면서 토익 성적이 700점 이상인 경우 
	 * 또는 성별이 남자이면서 토익 성적이 800점 이상인 경우에만 
	 * "항공 승무원 지원 자격 가능자입니다."를 출력하는 프로그램을 작성하시오. */

	public static void main(String[] args) {
		
		
		//성별을 숫자로 입력 받은 경우
		/*
		Scanner sc = new Scanner(System.in);
		int g = 0;
		int score = 0;
		System.out.print("성별(여자:1 남자:0) ==> ");
		g = Integer.parseInt(sc.nextLine());
		System.out.print("토익성적 ==> ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g==1 && score>=700) || (g==0 && score>=800)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		}else {
			System.out.println("지원 불가입니다.");
		}	*/
		
		//성별을 문자열로 입력 받은 경우
		Scanner sc = new Scanner(System.in);
		String g = "";
		int score = 0;
		
		System.out.print("성별(여자:f 남자:m) ==> ");
		g = sc.nextLine();
		System.out.print("토익성적 ==> ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g.equals("f") && score>=700) || (g.equals("m") && score>=800)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		}else {
			System.out.println("지원 불가입니다.");
		}

	}

}
