package poketmon;

import java.util.ArrayList;
import java.util.List;

public class Poketmon {
    String name;
    String type;
    int cp;

    public Poketmon(String name, String type, int cp){
        this.name = name;
        this.type = type;
        this.cp = cp;
    }
    public Poketmon(String name) {

    }

    void showGetMon() {
        System.out.println(name+" ["+type+"] "+"[CP:"+cp+"]");
    }

}
