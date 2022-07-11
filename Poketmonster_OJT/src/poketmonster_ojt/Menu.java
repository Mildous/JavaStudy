package poketmonster_ojt;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Menu {
	static final int CATCH =1 ,BAG=2, DELETE=3, FIGHT=4, EXIT=5;
	public static SplittableRandom random = new SplittableRandom();
	public static Scanner sc= new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1=>포켓몬잡으러가기");
		System.out.println("2=>내가방보기");
		System.out.println("3=>포켓몬삭제");
		System.out.println("4=>뮤츠와 대결");
		System.out.println("5=>종료");
	}
	
	public static void placeMenu() {
		System.out.println("장소를 선택하세요");
		System.out.println("1번 저 푸른 초원");
		System.out.println("2번 뜨거운 사막지대");
		System.out.println("3번 제주도 푸른바다");
		System.out.println("4번 한국전력공사");
	}
	
	public static void loginMenu() {
		System.out.println("1번 회원가입");
		System.out.println("2번 로그인");
	}
}
