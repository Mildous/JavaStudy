package poketmon;

import java.util.ArrayList;
import java.util.List;

public class Poketmon {
    private String name; //이름
    private String type; //속성
    private int cp; //공격력
    private List<Poketmon> poketmons;

    public Poketmon(String name, String type, int cp){
        this.name = name;
        this.type = type;
        this.cp = cp;
    }

    void showGetMon() {
        System.out.println(name+" ["+type+"] "+"[CP:"+cp+"]"); //기본 출력 양식
    }

    public Poketmon getPoketmon(List<Poketmon> poketmons, String selectType){ //selectType : 서브메뉴
        this.poketmons = poketmons;
        String type = selectType;
        List<Poketmon> typePoketmons = new ArrayList(); //리스트 생성


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
