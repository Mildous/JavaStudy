package poketmon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GameManager {
    private List<Poketmon> poketmons;
    
	public void PoketBag(){ //잡은 포켓몬을 담을 인벤토리
    }
	
    
    public Poketmon getPoketmon(List<Poketmon> poketmons, String selectType){
        this.poketmons = poketmons;
        String type = selectType;
        List<Poketmon> typePoketmons = new ArrayList();


        for(int i = 0 ; i < poketmons.size() ; i++){
            if(type.equals(poketmons.get(i).type)){
                typePoketmons.add(poketmons.get(i));
            }
        }
        Poketmon p = typePoketmons.get((int)(Math.random()*3));
        p.cp = ((int)Math.random())*100;
        return p;
    }


}
