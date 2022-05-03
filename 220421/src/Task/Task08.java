package Task;

import java.util.Scanner;

public class Task08 {
	
	/* 사용자로부터 가장 좋아하는 월을 입력받아 그 월에 해당되는 계절을 출력하는 프로그램을 
	 * 메뉴 형태로 do-while문을 사용하여 작성하시오. */

	public static void main(String[] args) {
		int m=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("====================");
			System.out.println("가장 좋아하는 월은?(종료:0)");
			System.out.print("====================");
			m = Integer.parseInt(sc.nextLine());
			System.out.println("****** "+m+"월 ******");
			
			
			if(m==12 || m==1 || m==2) {
				System.out.println(m+"월은 겨울에 해당됩니다");
			}else if(3<=m && m<=5) {
				System.out.println(m+"월은 봄에 해당됩니다");
			}else if(6<=m && m<=8) {
				System.out.println(m+"월은 여름에 해당됩니다");
			}else if(9<=m && m<=11) {
				System.out.println(m+"월은 가을에 해당됩니다");
			}
			System.out.printf("%n");
		}while(m!=0);

	}

}
