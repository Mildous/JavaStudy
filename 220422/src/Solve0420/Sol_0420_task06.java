package Solve0420;

import java.util.Scanner;

public class Sol_0420_task06 {
	//����ڷκ��� ���� �Է¹޾� �� �ܿ� �ش�Ǵ� �������� ������ ���� ���·� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		
		System.out.print("����� ��==>");
		input = Integer.parseInt(sc.nextLine());
		
		int i=9;
		do {
			if(i%2==0) {
				System.out.printf("%d * %d = %d%n", i, input, i*input);
			}
			i--;
		}while(i>0);
	}

}