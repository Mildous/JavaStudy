package Chap01;

import java.util.Scanner;

public class Exam05 {	
	/*������ ������ �Է¹޾� ������ ������ ���� ���� ���ɾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ������ 7, 8���� ��� : ���� 8%
	 * ������ 5, 6���� ��� : ���� 12% */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		int money = 0;
		double r = 0.0;
		double real = 0.0;
		
		System.out.print("����(5,6,7,8) ==> ");
		grade = Integer.parseInt(sc.nextLine());
		System.out.print("���� ====> ");
		money = Integer.parseInt(sc.nextLine());
		
		if(grade==5 || grade==6) {
			r = 0.12;
		} else if(grade==7 || grade==8) {
			r = 0.08;
		}
		
		real = money-money*r;
		
		System.out.printf("�Ǽ��ɾ�(����%d%%����) : %d", (int)(r*100), Math.round(real));
		
	}

}
