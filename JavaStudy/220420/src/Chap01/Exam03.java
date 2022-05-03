package Chap01;

import java.util.Scanner;

public class Exam03 {
	/* 두 개의 숫자를 입력받아 두 개의 수가 모두 짝수이거나 모두 홀수이면
	 * "두 숫자는 같은 짝수 또는 홀수입니다."를 출력하는 프로그램을 작성하시오. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		
		//입력
		System.out.println("숫자1 입력 ==> ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.println("숫자2 입력 ==> ");
		y = Integer.parseInt(sc.nextLine());
		
		//처리
		if((x%2==0 && y%2==0) || (y%2==1 && y%2==1)) {
			System.out.println("두 숫자는 같은 짝수 또는 홀수입니다.");
		}else {
			System.out.println("error");
		}

	}

}
