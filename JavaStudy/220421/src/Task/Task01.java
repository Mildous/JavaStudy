package Task;

import java.util.Scanner;

public class Task01 {
	
	//�ϳ��� ���ڸ� �Է¹޾� �� ���ڷκ��� 1������ ���� ���Ͽ� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, sum=0, i=1;
		System.out.print("�ϳ��� ���ڸ� �Է��ϼ���. : ");
		num = sc.nextInt();
		/*
		for(i=1; i<=1; ++i) {
			sum = num+i;
			System.out.print(num+"���� 1������ �� : "+sum);
		}*/
		
		do {
			sum = num+i;
			System.out.println(num+"���� 1������ �� : "+sum);
			i++;
		}
			while(i<=1);
	}

}
