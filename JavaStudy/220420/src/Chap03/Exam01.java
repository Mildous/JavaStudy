package Chap03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		String result = "";
		
		System.out.print("���� �ϳ��� �Է��Ͻÿ� ==> ");
		String temp = sc.nextLine();
		ch = temp.charAt(0);
		
		/*if('0'<=ch && ch<='9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		else if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
		} */
		
		result = (ch >= '0' && ch <='9') ? "����"	: "����";
		System.out.println(result);

		//���� ���� ������
		int i = 10;
		i = i+2;
		i+=2;
		
	}

}
