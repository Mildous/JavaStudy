package Solve0420;

import java.util.Scanner;

public class Sol_0420_task08 {
	//사용자로부터 가장 좋아하는 월을 입력받아 그 월에 해당되는 계절을 출력하는 프로그램을 메뉴 형태로 do-while문을 사용하여 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		String result="";
		
		do {
			System.out.print("월은?(종료:0)==>");
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 12: case 1: case 2:
				result = "겨울"; 
				break;
			case 3: case 4: case 5:
				result = "겨울"; 
				break;
			case 6: case 7: case 8:
				result = "겨울"; 
				break;
			case 9: case 10: case 11:
				result = "겨울"; 
				break;
			default : result = "잘못입력";
			}
			System.out.println(result);
			
		}while(input != 0);
		System.out.println("end");

	}

}
