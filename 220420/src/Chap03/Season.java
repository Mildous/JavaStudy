package Chap03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = 0;
		String result = "";
		
		System.out.print("월을 입력하세요. : ");
		m = Integer.parseInt(sc.nextLine());
		
		/* if(m>=3 && m<=5) {
			result = "봄";
		} else if(m>=6 && m<=8) {
			result = "여름";
		} else if(m>=9 && m<=11) {
			result = "가을";
		} else if((m>=1 && m<=2) || (m==12)) {
			result = "겨울";
		}
		
		System.out.println(season); */
		
		switch(m) {
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
	}

}