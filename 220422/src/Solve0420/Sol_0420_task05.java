package Solve0420;

import java.util.Scanner;

public class Sol_0420_task05 {
	/* 1. 3+6+9+12+...+N ���·� 3�� ����� ���Ѵ�.
	 * 2. �ϳ��� ���ڸ� �Է¹޴´�.
	 * 3. 3�� ����� �Էµ� ���ڸ� �Ѿ��� ���� N���� �� �հ�, 
	 * N���� ���°������ do-while �ݺ����� ����� ���α׷��� �ۼ��Ͻÿ�.	 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		int sum=0;
		int cnt=0;
		
		System.out.print("����� �Է��ϼ���==>");
		input = Integer.parseInt(sc.nextLine());
		
		do {
			sum = sum + 3*cnt;
			cnt++;
			
		}while(3*cnt < input);
		System.out.println(input+"�� �Ѿ��� ���� �� : "+ 3*cnt);
		System.out.println(input+"�� �Ѿ��� �������� ���հ� : "+ sum);
		System.out.println(input+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : "+ cnt);
	}

}
