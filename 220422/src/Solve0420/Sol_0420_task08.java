package Solve0420;

import java.util.Scanner;

public class Sol_0420_task08 {
	//����ڷκ��� ���� �����ϴ� ���� �Է¹޾� �� ���� �ش�Ǵ� ������ ����ϴ� ���α׷��� �޴� ���·� do-while���� ����Ͽ� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0;
		String result="";
		
		do {
			System.out.print("����?(����:0)==>");
			input = Integer.parseInt(sc.nextLine());
			switch(input) {
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
			
		}while(input != 0);
		System.out.println("end");

	}

}