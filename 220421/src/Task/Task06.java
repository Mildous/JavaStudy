package Task;

import java.util.Scanner;

public class Task06 {
	
	/* ����ڷκ��� ���� �Է¹޾� �� �ܿ� �ش�Ǵ� �������� 
	 * ������ ���� ���·� ����ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�. */

	public static void main(String[] args) {
		int num=0, count=8;
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է� : ");
		num = sc.nextInt();
		System.out.println("** "+num+"�� **");		
		
		do {
			System.out.println(count+" * "+num+" = "+count*num);
			count=count-2;
		}while(count>=2);

	}

}
