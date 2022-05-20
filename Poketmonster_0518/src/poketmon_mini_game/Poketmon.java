package poketmon_mini_game;

import java.util.ArrayList;
import java.util.List;

public class Poketmon {
    String name; //이름
    int type; //타입
    int level; //잡힐확률을 나누기 위한 레벨
    int cp; //뮤츠와의 대결을 위한 공격력

    public Poketmon(String name, int type, int level){
        this.name = name;
        this.type = type;
        this.level= level;
    }

    void showGetMon() { //출력 양식 메서드 - getPoketmon()에서 사용
        System.out.println("[Lv."+level+" "+name+"] [CP: "+cp+"]");
    }

}
