package poketmon;

import java.util.*;

public class GameManager {

	public void showBagInPokekmon(){
        for(int i = 0; i < GameConst.poketmonBag.size(); i++){
            Poketmon p = GameConst.poketmonBag.get(i);
            System.out.println("No. "+(i+1)+", "+"LV : " + p.level + ", NAME : " + p.name + ", CP : " + p.cp);
        }
        if(GameConst.poketmonBag.isEmpty()){
            System.out.println("empty bag..");
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
        /*
        switch (p.level){
            case 1:
                p.cp = getRandomNumber(GameConst.LV1_CP_MAP.get("min"), GameConst.LV1_CP_MAP.get("max"));
                    break;
            case 2:
                p.cp = getRandomNumber(GameConst.LV2_CP_MAP.get("min"), GameConst.LV2_CP_MAP.get("max"));
                    break;
            case 3:
                p.cp = getRandomNumber(GameConst.LV3_CP_MAP.get("min"), GameConst.LV3_CP_MAP.get("max"));
                    break;
        }*/
        p.cp = getRandomNumber(GameConst.LV_CP_MAPPING.get(p.level).get("min"), GameConst.LV_CP_MAPPING.get(p.level).get("max"));
        System.out.println("야생의 포켓몬 "+p.name+"을 만났다"+p.cp);
        p.showGetMon();
        if((new Random().nextInt(100) < GameConst.LV_CP_MAPPING.get(p.level).get("p"))){
            System.out.println("야생의 포켓몬을 잡는데 성공했다");
            setPoketmon(p);
            return true;
        }else{
            System.out.println("야생의 포켓몬을 잡는데 실패했다");
            return false;
        }
    }

    public void setPoketmon(Poketmon poketmon){
        GameConst.poketmonBag.add(poketmon);
    }

    public void deletePoketmon(int select){
        GameConst.poketmonBag.remove(select-1); //0부터 시작(-1)
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
