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
<<<<<<< HEAD
                        System.out.println("숫자만 입력하세요..");
=======
                        System.out.println("?닽?옄留? ?엯?젰?븯?꽭?슂..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
<<<<<<< HEAD
                        System.out.println("가방에 보관했습니다..");
                        choice = 2;
                    }else{
                        System.out.println("메인메뉴로 돌아갑니다..");
=======
                        System.out.println("媛?諛⑹뿉 蹂닿???뻽?뒿?땲?떎..");
                        choice = 2;
                    }else{
                        System.out.println("硫붿씤硫붾돱濡? ?룎?븘媛묐땲?떎..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
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
<<<<<<< HEAD
                        System.out.println(s"오박사에게 보냈습니다..");
                    }catch (NumberFormatException e){
                        System.out.println("숫자만 입력하세요..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("빈 가방입니다.." + (GameConst.poketmonBag.size()));
=======
                        System.out.println("?삤諛뺤궗?뿉寃? 蹂대깉?뒿?땲?떎..");
                    }catch (NumberFormatException e){
                        System.out.println("?닽?옄留? ?엯?젰?븯?꽭?슂..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("鍮? 媛?諛⑹엯?땲?떎.." + (GameConst.poketmonBag.size()));
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    }
                    choice = 0;
                    break;
                case 4:
<<<<<<< HEAD
                    System.out.println("게임종료..");
=======
                    System.out.println("寃뚯엫醫낅즺..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    return; 
            }
        }
    }
}