package Task;

import java.util.Scanner;

public class Task03 {
	
	//10���� ���ڸ� �Է¹޾� 0���� ū ���� ���ؼ��� ��ü �հ� ����� ����ϴ� ���α׷��� do-while �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, sum=0, i=0;
		do {	
			System.out.print("���ڸ� �Է��ϼ���. : ");
			num = sc.nextInt();
			if(num>0) {
				i++;
			}
			sum=num+sum;
		}
		while(i<10);
		System.out.println("��ü�� ��: "+sum);
		System.out.println("��ü�� ���: "+sum/10);
	}

}
