package Chap03;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = 0;
		String result = "";
		
		System.out.print("���� �Է��ϼ���. : ");
		m = Integer.parseInt(sc.nextLine());
		
		/* if(m>=3 && m<=5) {
			result = "��";
		} else if(m>=6 && m<=8) {
			result = "����";
		} else if(m>=9 && m<=11) {
			result = "����";
		} else if((m>=1 && m<=2) || (m==12)) {
			result = "�ܿ�";
		}
		
		System.out.println(season); */
		
		switch(m) {
			case 12: case 1: case 2:
				result = "�ܿ�"; 
				break;
			case 3: case 4: case 5:
				result = "�ܿ�"; 
				break;
			case 6: case 7: case 8:
				result = "�ܿ�"; 
				break;
			case 9: case 10: case 11:
				result = "�ܿ�"; 
				break;
			default : result = "�߸��Է�";
			}
		System.out.println(result);
	}

}