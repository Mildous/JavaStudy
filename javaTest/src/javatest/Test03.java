package javatest;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
/*	입력 : 이름, 국어, 영어, 수학 (단, 성적은 숫자만 입력 가능)
 *  숫자가 아니면 0으로 처리
 * 	출력 : 
 * 	-----------------------------------------------------
 * 	이름	국어	영어	수학	총점	평균	등급
 *  -----------------------------------------------------
 *  홍길동	 90 	 90 	 90  	270		 90		 수
 *  -----------------------------------------------------
 */
		Scanner s = new Scanner(System.in);
		System.out.print("your name is.. ");
		String name = s.nextLine();
		System.out.print("kor ? ");
		String kor_ = s.nextLine();
		int kor;
		try {
			kor = Integer.parseInt(kor_);
		} catch(Exception e) {
			kor = 0;
		}
		System.out.print("eng ? ");
		String eng_ = s.nextLine();
		int eng;
		try {
			eng = Integer.parseInt(eng_);
		} catch(Exception e) {
			eng = 0;
		}
		System.out.print("math ? ");
		String math_ = s.nextLine();
		int math;
		try {
			math = Integer.parseInt(math_);
		} catch(Exception e) {
			math = 0;
		}
		
		int total = kor + eng + math;
		double avg = total/3;
		String grade = "";
		
		if(avg >= 90) {
			grade = "수";
		} else if (avg >= 80 && avg < 90) {
			grade = "우";
		} else if (avg >= 70 && avg < 80) {
			grade = "미";
		} else if (avg >= 50 && avg < 70) {
			grade = "양";
		} else if (avg < 50) {
			grade = "가";
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" 이름\t국어\t영어\t수학\t총점\t평균\t등급 ");
		System.out.println("-----------------------------------------------------");
		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ math +"\t"+ total +"\t"+ avg +"\t"+ grade);
	}

}
