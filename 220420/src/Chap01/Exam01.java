package Chap01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int DIST = 400; //�Ÿ�
		int speed = 0;
		double time = 0.0;
		String result = "";
		
		//�Է�
		System.out.print("�ִ�ӵ� �Է� ==> ");
		speed = Integer.parseInt(sc.nextLine());
		
		//ó��
		time = (double)DIST/speed;
		
		if(time <= 2) {
			result = "High High Speed";
		}else if(time <= 3) {
			result = "High Speed";
		}else if(time >= 4) {
			result = "Good Speed";
		} //end if
		
		//��� ���
		System.out.println(result);
	}
}