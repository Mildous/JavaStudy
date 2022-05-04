package Solve0420;

import java.util.Scanner;

public class Sol_0420_task05 {
	/* 1. 3+6+9+12+...+N 형태로 3의 배수를 더한다.
	 * 2. 하나의 숫자를 입력받는다.
	 * 3. 3의 배수가 입력된 숫자를 넘었을 때의 N값과 총 합계, 
	 * N값이 몇번째인지를 do-while 반복문을 사용해 프로그램을 작성하시오.	 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		int sum=0;
		int cnt=0;
		
		System.out.print("양수를 입력하세요==>");
		input = Integer.parseInt(sc.nextLine());
		
		do {
			sum = sum + 3*cnt;
			cnt++;
			
		}while(3*cnt < input);
		System.out.println(input+"을 넘었을 때의 값 : "+ 3*cnt);
		System.out.println(input+"을 넘었을 때까지의 총합계 : "+ sum);
		System.out.println(input+"을 넘었을 때까지 몇 번째 3의 배수인가 : "+ cnt);
	}

}
