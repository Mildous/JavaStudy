package Task;

import java.util.Scanner;

public class Task05 {
	/*① 3+6+9+12+_+N 형태로 3의 배수를 더한다.
	 *② 하나의 숫자를 입력받는다.
	 *③ 3의 배수의 총합이 입력된 숫자를 넘었을 때의 N 값과 총합계 N 값이 몇 번째인지를 
	 *do-while 반복문을 사용해 프로그램을 작성하시오. */

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, sum=0, x=0, nth=0;
		
		System.out.print("사용자 입력 : ");
		num = sc.nextInt();
		
		do {
			sum = sum+x;
			x = x+3;
			nth = x/3;	
		}while(x<num);
		System.out.println(num+"을 넘었을 때의 값 : "+x);
		System.out.println(num+"을 넘었을 때까지의 총합계 : "+sum);
		System.out.println(num+"을 넘었을 때까지 몇 번째 3의 배수인가 : "+nth);
	
	}

}
