package pokemonVer01;

import java.util.Scanner;

public class GamePlay_Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		GameManager gm = new GameManager();
		
		int choice = 0;
		
		while(true) {
			MainMenuViewer.showMenu();
			choice = Integer.parseInt(sc.nextLine());
				
			switch(choice) {
			case 1:
				//����. ����޴�(����)�� ȣ���Ѵ�.
				break;
			case 2:
				gm.inventory(); //���� ���ϸ��� ������ ������ ��ü ������ ����Ѵ�
				break;
			case 3:
				//������ �������� ����Ѵ�. ex)������ ��� ���ϸ�, Ȯ��, cp����
				break;
			case 4:
				//������ ���ϴ� ���ϸ��� �Է¹޾� ����� ���ϸ��� �����Ѵ�.
				break;
			case 5:
				//�������� ���
				break;
			case 6:
				System.out.println("��������");
				return; //���α׷��� �����Ѵ�.
			}
		}
	}
}