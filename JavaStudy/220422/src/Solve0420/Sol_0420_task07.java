package Solve0420;

import java.util.Scanner;

public class Sol_0420_task07 {
	/* 10���� ������ �Է¹޾� ���� ���ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.
	 * �� ¦�� ��°�� �ԷµǴ� ���ڴ� ����� ������, ������ ����� �ٲپ� ���� ���Ͻÿ�. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int cnt=1;
		int sum=0;
		
		do {
			System.out.print("�Է�==>");
			input = Integer.parseInt(sc.nextLine());
			if(cnt%2==0) {
				input = -input;
			}
			sum= sum+input;
			cnt++;
		}while(cnt<=10);
		
		System.out.println("���� : "+sum);

	}

}
