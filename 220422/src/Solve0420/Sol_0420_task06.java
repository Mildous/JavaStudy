package Solve0420;

import java.util.Scanner;

public class Sol_0420_task06 {
	//사용자로부터 단을 입력받아 그 단에 해당되는 구구단을 다음과 같은 형태로 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		
		System.out.print("출력할 단==>");
		input = Integer.parseInt(sc.nextLine());
		
		int i=9;
		do {
			if(i%2==0) {
				System.out.printf("%d * %d = %d%n", i, input, i*input);
			}
			i--;
		}while(i>0);
	}

}
