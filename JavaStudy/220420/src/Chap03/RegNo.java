package Chap03;

import java.util.Scanner;

public class RegNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���. (000000-0000000) : ");
		String no = sc.nextLine();
		char gen = no.charAt(7);
		
		switch(gen) {
			case '1': case '3':
				switch(gen) {
					case '1':
						System.out.println("2000�� ���� ����� �����Դϴ�.");
						break;
					case '3':
						System.out.println("2000�� ���� ����� �����Դϴ�.");
						break;
				}
			break;
			case '2': case '4':
				switch(gen) {
					case '2':
						System.out.println("2000�� ���� ����� �����Դϴ�.");
						break;
					case '4':
						System.out.println("2000�� ���� ����� �����Դϴ�.");
						break;
				}
			break;
		}
		
	}

}
