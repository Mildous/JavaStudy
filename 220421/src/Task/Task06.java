package Task;

import java.util.Scanner;

public class Task06 {
	
	/* 사용자로부터 단을 입력받아 그 단에 해당되는 구구단을 
	 * 다음과 같은 형태로 출력하는 프로그램을 do-while문을 사용하여 작성하시오. */

	public static void main(String[] args) {
		int num=0, count=8;
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 입력 : ");
		num = sc.nextInt();
		System.out.println("** "+num+"단 **");		
		
		do {
			System.out.println(count+" * "+num+" = "+count*num);
			count=count-2;
		}while(count>=2);

	}

}
