package Solve0420;

public class Sol_0420_task04 {
	/*1���� 100������ ���� ���Ͽ� ������ ���� ����ϴ� ���α׷��� do-while �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�.
	10�� �������� �հ踦 ����Ѵ�. */

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		/*
		for(i=1; i<=100; i++) {
			sum = sum+i;
			if(i%10==0) {
			System.out.printf("1-%d : %d%n", i, sum);
			}
		}
		*/
		i=1;
		do {
			sum = sum+i;
			if(i%10==0) {
				System.out.printf("1-%d : %d%n", i, sum);
				}
			i++;
		}while(i<=100);

	}

}
