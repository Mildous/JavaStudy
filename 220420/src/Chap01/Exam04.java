package Chap01;

import java.util.Scanner;

public class Exam04 {
	/* ������ �����̸鼭 ���� ������ 700�� �̻��� ��� 
	 * �Ǵ� ������ �����̸鼭 ���� ������ 800�� �̻��� ��쿡�� 
	 * "�װ� �¹��� ���� �ڰ� �������Դϴ�."�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

	public static void main(String[] args) {
		
		
		//������ ���ڷ� �Է� ���� ���
		/*
		Scanner sc = new Scanner(System.in);
		int g = 0;
		int score = 0;
		System.out.print("����(����:1 ����:0) ==> ");
		g = Integer.parseInt(sc.nextLine());
		System.out.print("���ͼ��� ==> ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g==1 && score>=700) || (g==0 && score>=800)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		}else {
			System.out.println("���� �Ұ��Դϴ�.");
		}	*/
		
		//������ ���ڿ��� �Է� ���� ���
		Scanner sc = new Scanner(System.in);
		String g = "";
		int score = 0;
		
		System.out.print("����(����:f ����:m) ==> ");
		g = sc.nextLine();
		System.out.print("���ͼ��� ==> ");
		score = Integer.parseInt(sc.nextLine());
		
		if((g.equals("f") && score>=700) || (g.equals("m") && score>=800)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		}else {
			System.out.println("���� �Ұ��Դϴ�.");
		}

	}

}
