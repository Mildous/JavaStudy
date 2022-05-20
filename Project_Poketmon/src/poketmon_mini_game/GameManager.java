package poketmon_mini_game;

import java.util.*;

public class GameManager {

	public void showBagInPokekmon(){
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i);
            System.out.println("["+(i+1)+"] "+"[Lv." + p.level + " " + p.name + "] [CP: " + p.cp +"]");
        }
        if(GameConst.poketmonBag.isEmpty()){
            System.out.println("빈 가방입니다..");
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
        System.out.println("야생의 포켓몬 \"+p.name+\"이(가) 나타났다!");
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("와! 잡았다!");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("놓쳐버렸다..");
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
