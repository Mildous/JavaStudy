package Solve0420;

import java.util.Scanner;

public class Sol_0420_task03 {
	//10���� ���ڸ� �Է¹޾�, 0���� ū ���� ���ؼ��� ��ü �հ� ����� ����ϴ� ���α׷��� do-while �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		//0. 10�� �ݺ�
		//1. �Է¹ޱ�
		//2. ���/���� �Ǵ� : ���->�����ϱ�, ī��Ʈ
		/*
		for(int i=0; i<10; i++) {
			System.out.print("�����Է�==>");
			input = Integer.parseInt(sc.nextLine());
			if(input > 0) {
				sum = sum+input;
				cnt++;
			}
			
			
		}
		*/
		
		int i = 0;
		do {
			System.out.print("�����Է�==>");
			input = Integer.parseInt(sc.nextLine());
			if(input > 0) {
				sum = sum+input;
				cnt++;
			}
		
			i++;
		}while(i<10);
		System.out.println(cnt);
		//3. ��� ���ϱ�
		avg = sum/(double)cnt;
		System.out.printf("�� : %d ��� : %f",sum,avg);

	}

}