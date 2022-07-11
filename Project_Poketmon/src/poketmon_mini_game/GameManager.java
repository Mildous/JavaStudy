package poketmon_mini_game;

import java.util.*;

public class GameManager {

<<<<<<< HEAD
	public void showBagInPokekmon(){
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i);
            System.out.println("["+(i+1)+"] "+"[Lv." + p.level + " " + p.name + "] [CP: " + p.cp +"]");
        }
        if(GameConst.poketmonBag.isEmpty()){
            System.out.println("ºó °¡¹æÀÔ´Ï´Ù..");
=======
	public void showBagInPokekmon(){ //ê°€ë°©ì— ë‹´ê¸´ listë¥¼ ë³´ì—¬ì£¼ëŠ” í•¨ìˆ˜
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i); //poketmonBagì— ë‹´ê¸´ê²ƒì„ pì— ëŒ€ìž…
            System.out.println("["+(i+1)+"] "+"[Lv." + p.level + " " + p.name + "] [CP: " + p.cp +"]");
        }
        if(GameConst.poketmonBag.isEmpty()){ //ë¹„ì–´ìžˆëŠ” listì¼ ê²½ìš°
            System.out.println("ë¹ˆ ê°€ë°©ìž…ë‹ˆë‹¤..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
        }
    }
	
    
    public boolean getPoketmon(int selectType){
        List<Poketmon> typePoketmons = new ArrayList();
        for(int i = 0 ; i < GameConst.poketmons.size() ; i++){
            if(selectType == GameConst.poketmons.get(i).type){
                typePoketmons.add(GameConst.poketmons.get(i));
            }
        }
        Poketmon p = typePoketmons.get((int)(Math.random()*3));
        
        p.cp = getRandomNumber(GameConst.LV_CP_MAPPING.get(p.level).get("min"), GameConst.LV_CP_MAPPING.get(p.level).get("max"));
<<<<<<< HEAD
        System.out.println("¾ß»ýÀÇ Æ÷ÄÏ¸ó "+p.name+"ÀÌ(°¡) ³ªÅ¸³µ´Ù!");
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("¿Í! Àâ¾Ò´Ù!");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("½ÇÆÐÇß´Ù..");
=======
        System.out.println("ì•¼ìƒì˜ í¬ì¼“ëª¬ "+p.name+"ì´(ê°€) ë‚˜íƒ€ë‚¬ë‹¤!");
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("ì™€! ìž¡ì•˜ë‹¤!");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("ë†“ì³ë²„ë ¸ë‹¤..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
            return false;
        }
    }

    public void setPoketmon(Poketmon poketmon){
        GameConst.poketmonBag.add(poketmon);
    }

    public void deletePoketmon(int select){
    	
        GameConst.poketmonBag.remove(select-1);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
