package poketmon_mini_game;

import java.util.ArrayList;
import java.util.List;

public class Poketmon {
    String name;
    int type;
    int level;
    int cp;

    public Poketmon(String name, int type, int level){
        this.name = name;
        this.type = type;
        this.level= level;
    }

    void showGetMon() {
        System.out.println("[Lv."+level+" "+name+"] [CP: "+cp+"]");
    }

}
