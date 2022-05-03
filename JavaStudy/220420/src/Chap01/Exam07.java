package Chap01;

import java.util.Scanner;

public class Exam07 {
	/* 사원의 등급에 따라 시간당 급여가 다음과 같이 정의되어 있다.
	 * 1주일에 40시간이 기본 근무시간이며, 이를 초과하는 경우 기본 시간당 급여의 1.5배가 지급된다.
	 * 사원의 등급과 1주일 동안의 근무 시간을 입력받아 주 급여를 출력하는 프로그램을 작성하시오.
	 * 단, 근무 시간이 40시간에 미달하는 경우에는 40시간으로 처리한다.
	 * 직급이 7, 8급인 경우 : 15000/시간
	 * 직급이 5, 6급인 경우 : 20000/시간 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;
		int mph = 0;
		int hour = 0;
		double total = 0;
		
		System.out.print("직급(5,6,7,8) ==> ");
		grade = Integer.parseInt(sc.nextLine());
		System.out.print("근무시간 ==> ");
		hour = Integer.parseInt(sc.nextLine());
		
		//시급결정
		if(grade==5 || grade==6) {
			mph = 20000;
		} else if(grade==7 || grade==8) {
			mph = 15000;
		}
		
		//근무시간 체크해서 40이하이면 40으로 결정
		if(hour < 40) {
			hour = 40;
		}
		
		//급여계산
		total = (mph*40) + (mph*(hour-40)*1.5);
		
		System.out.println("주급여 : " +Math.round(total));

	}

}
