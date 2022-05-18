package poketmonster_ojt;

import java.util.Arrays;
import java.util.Scanner;

public class PoketMonWorld {

	public static void main(String[] args) {
		PoketMonBag bag= PoketMonBag.getPoketMonBag();
		int choice = 0;
		PoketMon tmp = null;
		while(true) {
			MainMenuViewer.showMenu();
			choice=Integer.parseInt(Read.sc.nextLine());
			if(choice==1) {
				tmp=bag.catchPoketmon();
				if(tmp!=null) {
				bag.poketmonBag.add(tmp);
				}
			}else if(choice==2) {
				bag.showBag();
			}else if(choice==3) {
				bag.deletePoketMon();
			}else if(choice==4) {
				bag.fight();
			}else if(choice==5) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
	}
}