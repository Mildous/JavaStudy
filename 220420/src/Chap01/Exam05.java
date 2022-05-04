package Chap01;

import java.util.Scanner;

public class Exam05 {	
	/*본봉과 직급을 입력받아 세금을 공제한 다음 실제 수령액을 출력하는 프로그램을 작성하시오.
	 * 직급이 7, 8급인 경우 : 세금 8%
	 * 직급이 5, 6급인 경우 : 세금 12% */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int money = 0;
		double r = 0.0;
		double real = 0.0;
		
		System.out.print("직급(5,6,7,8) ==> ");
		grade = Integer.parseInt(sc.nextLine());
		System.out.print("본봉 ====> ");
		money = Integer.parseInt(sc.nextLine());
		
		if(grade==5 || grade==6) {
			r = 0.12;
		} else if(grade==7 || grade==8) {
			r = 0.08;
		}
		
		real = money-money*r;
		
		System.out.printf("실수령액(세금%d%%적용) : %d", (int)(r*100), Math.round(real));
		
	}

}
