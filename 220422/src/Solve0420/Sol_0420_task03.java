package Solve0420;

import java.util.Scanner;

public class Sol_0420_task03 {
	//10개의 숫자를 입력받아, 0보다 큰 수에 대해서만 전체 합과 평균을 출력하는 프로그램을 do-while 반복문을 이용하여 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		//0. 10번 반복
		//1. 입력받기
		//2. 양수/음수 판단 : 양수->누적하기, 카운트
		/*
		for(int i=0; i<10; i++) {
			System.out.print("숫자입력==>");
			input = Integer.parseInt(sc.nextLine());
			if(input > 0) {
				sum = sum+input;
				cnt++;
			}
			
			
		}
		*/
		
		int i = 0;
		do {
			System.out.print("숫자입력==>");
			input = Integer.parseInt(sc.nextLine());
			if(input > 0) {
				sum = sum+input;
				cnt++;
			}
		
			i++;
		}while(i<10);
		System.out.println(cnt);
		//3. 평균 구하기
		avg = sum/(double)cnt;
		System.out.printf("합 : %d 평균 : %f",sum,avg);

	}

}
