package poketmonster_ojt;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Menu {
	static final int CATCH =1 ,BAG=2, DELETE=3, FIGHT=4, EXIT=5;
	public static SplittableRandom random = new SplittableRandom();
	public static Scanner sc= new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("�޴��� �����ϼ���");
		System.out.println("1=>���ϸ�����������");
		System.out.println("2=>�����溸��");
		System.out.println("3=>���ϸ����");
		System.out.println("4=>������ ���");
		System.out.println("5=>����");
	}
	
	public static void placeMenu() {
		System.out.println("��Ҹ� �����ϼ���");
		System.out.println("1�� �� Ǫ�� �ʿ�");
		System.out.println("2�� �߰ſ� �縷����");
		System.out.println("3�� ���ֵ� Ǫ���ٴ�");
		System.out.println("4�� �ѱ����°���");
	}
	
	public static void loginMenu() {
		System.out.println("1�� ȸ������");
		System.out.println("2�� �α���");
	}
}
