package Task01;

import java.util.Scanner;

public class UmbrellaTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Umbrella uArr[] = new Umbrella[3];
	
	for(int i=0; i<3; i++) {
		uArr[i] = new Umbrella();
		System.out.print("우산 타입 ==> ");
		uArr[i].setType(sc.nextLine());
		System.out.print("우산 무늬 ==> ");
		uArr[i].setPattern(sc.nextLine());
		System.out.print("우산 색상 ==> ");
		uArr[i].setColor(sc.nextLine());
	}
	for(int i=0; i<uArr.length; i++) {
		uArr[i].showUmbrella(); 
		}
	}

}
