package Task01;

import java.util.Scanner;

public class UmbrellaTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Umbrella uArr[] = new Umbrella[3];
	
	for(int i=0; i<3; i++) {
		uArr[i] = new Umbrella();
		System.out.print("��� Ÿ�� ==> ");
		uArr[i].setType(sc.nextLine());
		System.out.print("��� ���� ==> ");
		uArr[i].setPattern(sc.nextLine());
		System.out.print("��� ���� ==> ");
		uArr[i].setColor(sc.nextLine());
	}
	for(int i=0; i<uArr.length; i++) {
		uArr[i].showUmbrella(); 
		}
	}

}