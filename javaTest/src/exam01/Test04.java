package exam01;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		학생 3명의 성적(이름, 국어, 영어, 수학)을 입력받아서 출력..
		
		Scanner s = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		for(int i=0; i<name.length; i++) {
			System.out.print(i+1 + "번째 학생의 이름 : ");
			name[i] = s.nextLine();
			System.out.print(i+1 + "번째 학생의 국어점수 : ");
			kor[i] = Integer.parseInt(s.nextLine());
			System.out.print(i+1 + "번째 학생의 영어점수 : ");
			eng[i] = Integer.parseInt(s.nextLine());
			System.out.print(i+1 + "번째 학생의 수학점수 : ");
			math[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		for(int i=0; i<name.length; i++) {
			int total = kor[i] + eng[i] + math[i];
			double avg = total/3;
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + total + "\t" + avg);
		}
		

	}

}
