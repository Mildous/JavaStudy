package Task;

import java.util.Scanner;

public class Task07 {
	
	/*10���� ������ �Է¹޾� ���� ���ϴ� ���α׷��� do-while���� ����Ͽ� �ۼ��Ͻÿ�.
	 * �� ¦�� ��°�� �ԷµǴ� ���ڴ� ����� ������, ������ ����� �ٲپ� ���� ���Ͻÿ�. */

	public static void main(String[] args) {
		int num=0, sum=0, count=1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("���ڸ� �Է��ϼ���. : ");
			num = sc.nextInt();
				if(count%2==0) {
					num=-num;
				}else if(count%2==1) 
				sum = sum+num;
				count = count+1;
		}while(count<=10);
		System.out.print("�Է��� ���� 10���� �� : "+sum);

	}

}
