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
                        System.out.println("���ڸ� �Է��ϼ���..");
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
                        System.out.println("���濡 �����߽��ϴ�..");
                        choice = 2;
                    }else{
                        System.out.println("���θ޴��� ���ư��ϴ�..");
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
                        System.out.println("���ڻ翡�� ���½��ϴ�..");
                    }catch (NumberFormatException e){
                        System.out.println("���ڸ� �Է��ϼ���..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("�� �����Դϴ�.." + (GameConst.poketmonBag.size()));
                    }
                    choice = 0;
                    break;
                case 4:
                    System.out.println("��������..");
                    return; 
            }
        }
    }
}