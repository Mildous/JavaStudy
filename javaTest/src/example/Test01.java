package example;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		입력 : 3명분의 이름, 국어, 영어, 수학	<-- 변수 1개 사용
//		출력 : 이름 국어 영어 수학 총점
		
		Scanner s = new Scanner(System.in);
		String stu = "";
		int stuCount = 3;
		int total = 0;
		double avg = 0;
		
		for(int i=0; i<stuCount; i++) {
			int kor = 0;
			int eng = 0;
			int math = 0;
			System.out.print((i+1) + " name.. ");
			stu = stu + s.nextLine();
			
			System.out.print((i+1) + " kor.. ");
			kor = Integer.parseInt(s.nextLine());
			stu = stu + "\t" + kor;
			
			System.out.print((i+1) + " eng.. ");
			eng = Integer.parseInt(s.nextLine());
			stu = stu + "\t" + eng;

			System.out.print((i+1) + " math.. ");
			math = Integer.parseInt(s.nextLine());
			total = kor + eng + math;
			avg = total/3;
			stu = stu + "\t" + math + "\t" + total + "\t" + avg + "\n";
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		System.out.println(stu);
	}

}
