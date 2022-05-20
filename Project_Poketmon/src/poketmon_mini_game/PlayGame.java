package poketmon_mini_game;

import java.util.*;

public class PlayGame {

    public static void main(String[] args) {
    	System.out.println("Hello Poketmon World!");
        GameManager gm = new GameManager();
        int choice = 0;
        while (true) {
            switch (choice) {
                case 0:
                    MenuViewer.showMainMenu();
                    try {
                        choice = Integer.parseInt(GameConst.sc.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("숫자만 입력하세요..");
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
                        System.out.println("가방에 보관했습니다..");
                        choice = 2;
                    }else{
                        System.out.println("메인메뉴로 돌아갑니다..");
                        choice = 0;
                    }
                    break;
                case 2:
                    gm.showBagInPokekmon();
                    choice = 0;
                    break;
                case 3:
                    MenuViewer.deleteMenu();
                    try {
                    	gm.showBagInPokekmon();
                    	System.out.print("-> ");
                        gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));
                        System.out.println("오박사에게 보냈습니다..");
                    }catch (NumberFormatException e){
                        System.out.println("숫자만 입력하세요..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("빈 가방입니다.." + (GameConst.poketmonBag.size()));
                    }
                    choice = 0;
                    break;
                case 4:
                    System.out.println("게임종료..");
                    return; 
            }
        }
    }
}