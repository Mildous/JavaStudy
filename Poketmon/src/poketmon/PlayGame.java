package poketmon;

import java.awt.*;
import java.util.*;

public class PlayGame {

    public static void main(String[] args) {
    	System.out.println("포켓몬 월드에 오신것을 환영합니다!");
        GameManager gm = new GameManager();
        int choice = 0;
        while (true) {
            switch (choice) {
                case 0:
                    MenuViewer.showMainMenu();
                    try {
                        choice = Integer.parseInt(GameConst.sc.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("not allow strings..");
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    //int selectType = Integer.parseInt(GameConst.sc.nextLine());
                    //Poketmon p = gm.getPoketmon(selectType);
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
                        System.out.println("success catch..");
                        choice = 2;
                    }else{
                        System.out.println("fail catch..");
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
                        gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));
                        System.out.println("삭제완료");
                    }catch (NumberFormatException e){
                        System.out.println("not allow strings..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("range out.. max range : " + (GameConst.poketmonBag.size()));
                    }
                    choice = 0;
                    break;
                case 4:
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