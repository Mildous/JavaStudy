package Task;

import java.util.Scanner;

public class Task03 {
	
	//10개의 숫자를 입력받아 0보다 큰 수에 대해서만 전체 합과 평균을 출력하는 프로그램을 do-while 반복문을 이용하여 작성하시오.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, sum=0, i=0;
		do {	
			System.out.print("숫자를 입력하세요. : ");
			num = sc.nextInt();
			if(num>0) {
				i++;
			}
			sum=num+sum;
		}
		while(i<10);
		System.out.println("전체의 합: "+sum);
		System.out.println("전체의 평균: "+sum/10);
	}

}
