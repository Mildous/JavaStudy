package Task;

import java.util.Scanner;

public class Task05 {
	/*�� 3+6+9+12+_+N ���·� 3�� ����� ���Ѵ�.
	 *�� �ϳ��� ���ڸ� �Է¹޴´�.
	 *�� 3�� ����� ������ �Էµ� ���ڸ� �Ѿ��� ���� N ���� ���հ� N ���� �� ��°������ 
	 *do-while �ݺ����� ����� ���α׷��� �ۼ��Ͻÿ�. */

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0, x=0, nth=0;
		
		System.out.print("����� �Է� : ");
		num = sc.nextInt();
		
		do {
			sum = sum+x;
			x = x+3;
			nth = x/3;	
		}while(x<num);
		System.out.println(num+"�� �Ѿ��� ���� �� : "+x);
		System.out.println(num+"�� �Ѿ��� �������� ���հ� : "+sum);
		System.out.println(num+"�� �Ѿ��� ������ �� ��° 3�� ����ΰ� : "+nth);
	
	}

}