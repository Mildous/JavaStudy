package Solve0420;

public class Sol_0420_task04 {
	/*1부터 100까지의 합을 구하여 다음과 같이 출력하는 프로그램을 do-while 반복문을 이용하여 작성하시오.
	10을 기준으로 합계를 출력한다. */

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
