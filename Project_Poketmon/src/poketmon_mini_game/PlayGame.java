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
                        System.out.println("¼ýÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä..");
=======
                        System.out.println("ìˆ«ìžë§Œ ìž…ë ¥í•˜ì„¸ìš”..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
<<<<<<< HEAD
                        System.out.println("°¡¹æ¿¡ º¸°üÇß½À´Ï´Ù..");
                        choice = 2;
                    }else{
                        System.out.println("¸ÞÀÎ¸Þ´º·Î µ¹¾Æ°©´Ï´Ù..");
=======
                        System.out.println("ê°€ë°©ì— ë³´ê´€í–ˆìŠµë‹ˆë‹¤..");
                        choice = 2;
                    }else{
                        System.out.println("ë©”ì¸ë©”ë‰´ë¡œ ëŒì•„ê°‘ë‹ˆë‹¤..");
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
                        System.out.println(s"¿À¹Ú»ç¿¡°Ô º¸³Â½À´Ï´Ù..");
                    }catch (NumberFormatException e){
                        System.out.println("¼ýÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("ºó °¡¹æÀÔ´Ï´Ù.." + (GameConst.poketmonBag.size()));
=======
                        System.out.println("ì˜¤ë°•ì‚¬ì—ê²Œ ë³´ëƒˆìŠµë‹ˆë‹¤..");
                    }catch (NumberFormatException e){
                        System.out.println("ìˆ«ìžë§Œ ìž…ë ¥í•˜ì„¸ìš”..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("ë¹ˆ ê°€ë°©ìž…ë‹ˆë‹¤.." + (GameConst.poketmonBag.size()));
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    }
                    choice = 0;
                    break;
                case 4:
<<<<<<< HEAD
                    System.out.println("°ÔÀÓÁ¾·á..");
=======
                    System.out.println("ê²Œìž„ì¢…ë£Œ..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    return; 
            }
        }
    }
}