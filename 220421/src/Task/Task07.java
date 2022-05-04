package Task;

import java.util.Scanner;

public class Task07 {
	
	/*10개의 정수를 입력받아 합을 구하는 프로그램을 do-while문을 사용하여 작성하시오.
	 * 단 짝수 번째에 입력되는 숫자는 양수는 음수로, 음수는 양수로 바꾸어 합을 구하시오. */

	public static void main(String[] args) {
		int num=0, sum=0, count=1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("숫자를 입력하세요. : ");
			num = sc.nextInt();
				if(count%2==0) {
					num=-num;
				}else if(count%2==1) 
				sum = sum+num;
				count = count+1;
		}while(count<=10);
		System.out.print("입력한 정수 10개의 합 : "+sum);

	}

}
