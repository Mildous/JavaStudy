package Chap01;

import java.util.Scanner;

public class Exam02 {
	/*���̿� ������ �Է¹޾� ���̰� 30�� �̸��̰�, ������ 3.5 �̻��̸� "��õ ����Դϴ�"�� ����ϰ�
	  �׷��� ������ "��õ ����� �ƴմϴ�"�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		double score = 0.0;
		String result = "";
		
		//�Է�
		System.out.print("���� ==> ");
		age = Integer.parseInt(sc.nextLine());
		System.out.print("���� ==> ");
		score = Double.parseDouble(sc.nextLine());
		
		//ó��
		if(age<30 && score>=3.5) {
			result = "��õ ����Դϴ�";
		} else {
			result = "��õ ����� �ƴմϴ�";
		}
		
		//���
		System.out.println(result);
		
	}
	
}
