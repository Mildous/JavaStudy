package Chap01;

import java.util.Scanner;

public class Exam03 {
	/* �� ���� ���ڸ� �Է¹޾� �� ���� ���� ��� ¦���̰ų� ��� Ȧ���̸�
	 * "�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�."�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0;
		
		//�Է�
		System.out.println("����1 �Է� ==> ");
		x = Integer.parseInt(sc.nextLine());
		
		System.out.println("����2 �Է� ==> ");
		y = Integer.parseInt(sc.nextLine());
		
		//ó��
		if((x%2==0 && y%2==0) || (y%2==1 && y%2==1)) {
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�.");
		}else {
			System.out.println("error");
		}

	}

}
