package Task;

import java.util.Scanner;

public class Task08 {
	
	/* ����ڷκ��� ���� �����ϴ� ���� �Է¹޾� �� ���� �ش�Ǵ� ������ ����ϴ� ���α׷��� 
	 * �޴� ���·� do-while���� ����Ͽ� �ۼ��Ͻÿ�. */

	public static void main(String[] args) {
		int m=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("====================");
			System.out.println("���� �����ϴ� ����?(����:0)");
			System.out.print("====================");
			m = Integer.parseInt(sc.nextLine());
			System.out.println("****** "+m+"�� ******");
			
			
			if(m==12 || m==1 || m==2) {
				System.out.println(m+"���� �ܿ￡ �ش�˴ϴ�");
			}else if(3<=m && m<=5) {
				System.out.println(m+"���� ���� �ش�˴ϴ�");
			}else if(6<=m && m<=8) {
				System.out.println(m+"���� ������ �ش�˴ϴ�");
			}else if(9<=m && m<=11) {
				System.out.println(m+"���� ������ �ش�˴ϴ�");
			}
			System.out.printf("%n");
		}while(m!=0);

	}

}