package Solve0420;

import java.util.Scanner;

public class Sol_0420_task07 {
	/* 10개의 정수를 입력받아 합을 구하는 프로그램을 do-while문을 사용하여 작성하시오.
	 * 단 짝수 번째에 입력되는 숫자는 양수는 음수로, 음수는 양수로 바꾸어 합을 구하시오. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int cnt=1;
		int sum=0;
		
		do {
			System.out.print("입력==>");
			input = Integer.parseInt(sc.nextLine());
			if(cnt%2==0) {
				input = -input;
			}
			sum= sum+input;
			cnt++;
		}while(cnt<=10);
		
		System.out.println("합은 : "+sum);

	}

}
