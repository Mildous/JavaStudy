package Solve0420;

import java.util.Scanner;

public class Sol_0420_task01 {
	//100부터 1까지의 수 중에서 홀수의 합을 구하여 출력하는 프로그램을 do-while문을 사용하여 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		
		System.out.print("정수를 입력하세요==>");
		num = Integer.parseInt(sc.nextLine());
		/*
		do {
			sum = sum+num;
			num--;
			System.out.println(sum+" : "+num);
			
		}while(num>0);
		*/
		/*
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("합은 "+sum);
		*/
		while(num>0) {
			sum = sum+num;
			num--;
			}
			System.out.println("합은 "+sum);
		}

	}

