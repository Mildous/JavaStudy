package Task;

import java.util.Scanner;

public class Task01 {
	
	//하나의 숫자를 입력받아 그 숫자로부터 1까지의 합을 구하여 출력하는 프로그램을 do-while문을 사용하여 작성하시오.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, sum=0, i=1;
		System.out.print("하나의 숫자를 입력하세요. : ");
		num = sc.nextInt();
		/*
		for(i=1; i<=1; ++i) {
			sum = num+i;
			System.out.print(num+"부터 1까지의 합 : "+sum);
		}*/
		
		do {
			sum = num+i;
			System.out.println(num+"부터 1까지의 합 : "+sum);
			i++;
		}
			while(i<=1);
	}

}
