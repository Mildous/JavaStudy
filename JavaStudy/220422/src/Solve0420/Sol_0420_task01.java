package Solve0420;

import java.util.Scanner;

public class Sol_0420_task01 {
	//100���� 1������ �� �߿��� Ȧ���� ���� ���Ͽ� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		
		System.out.print("������ �Է��ϼ���==>");
		num = Integer.parseInt(sc.nextLine());
		/*
		do {
			sum = sum+num;
			num--;
			System.out.println(sum+" : "+num);
			
		}while(num>0);
		*/
		/*
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("���� "+sum);
		*/
		while(num>0) {
			sum = sum+num;
			num--;
			}
			System.out.println("���� "+sum);
		}

	}

