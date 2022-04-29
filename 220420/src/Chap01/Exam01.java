package Chap01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int DIST = 400; //거리
		int speed = 0;
		double time = 0.0;
		String result = "";
		
		//입력
		System.out.print("최대속도 입력 ==> ");
		speed = Integer.parseInt(sc.nextLine());
		
		//처리
		time = (double)DIST/speed;
		
		if(time <= 2) {
			result = "High High Speed";
		}else if(time <= 3) {
			result = "High Speed";
		}else if(time >= 4) {
			result = "Good Speed";
		} //end if
		
		//결과 출력
		System.out.println(result);
	}
}