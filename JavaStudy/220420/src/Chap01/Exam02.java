package Chap01;

import java.util.Scanner;

public class Exam02 {
	/*나이와 성적을 입력받아 나이가 30세 미만이고, 성적이 3.5 이상이면 "추천 대상입니다"를 출력하고
	  그렇지 않으면 "추천 대상이 아닙니다"를 출력하는 프로그램을 작성하시오.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		double score = 0.0;
		String result = "";
		
		//입력
		System.out.print("나이 ==> ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("성적 ==> ");
		score = Double.parseDouble(sc.nextLine());
		
		//처리
		if(age<30 && score>=3.5) {
			result = "추천 대상입니다";
		} else {
			result = "추천 대상이 아닙니다";
		}
		
		//출력
		System.out.println(result);
		
	}
	
}
