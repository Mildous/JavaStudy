package poketmon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlayGame {
	static Map<Integer, String> menu = new HashMap();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("포켓몬 월드에 오신것을 환영합니다!");
        GameManager gm = new GameManager();

        int choice = 0;
        while (true) {
            MenuViewer.showMenu();
            choice = Integer.parseInt(MenuViewer.sc.nextLine());

            switch (choice) {
                case 1:
                	
                    break;
                case 2:
                    gm.PoketBag(); 
                    break;
                case 3:
                    System.out.println("게임종료");
                    return; 
            }
        }
    }
    static void addType(String typeKinds, String name) {
    	
    }
    static void poketmonType(String typeKinds) {
        
     
        
    }

}