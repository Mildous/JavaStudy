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
				//입장. 서브메뉴(지역)를 호출한다.
				break;
			case 2:
				gm.inventory(); //잡은 포켓몬을 저장한 가방의 전체 내용을 출력한다
				break;
			case 3:
				//게임의 상세정보를 출력한다. ex)지역별 출몰 포켓몬, 확률, cp범위
				break;
			case 4:
				//삭제를 원하는 포켓몬을 입력받아 저장된 포켓몬을 삭제한다.
				break;
			case 5:
				//뮤츠와의 대결
				break;
			case 6:
				System.out.println("게임종료");
				return; //프로그램을 종료한다.
			}
		}
	}
}