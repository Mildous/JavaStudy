package Solve0420;

public class Sol_0420_task02 {
	//100부터 1까지의 수 중에서 홀수의 합을 구하여 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

	public static void main(String[] args) {
		int sum=0;
		/* for문
		for(int i=1; i<=100; i=i+2) {
			sum += i;
		}
		*/
		/* while문
		int i=1;
		while(i<=100) {
			sum += i;
			i+=2;
		}
		*/
		int i=1;
		do {
			if(i%2==1) {
				sum += i;
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		
	}

}
