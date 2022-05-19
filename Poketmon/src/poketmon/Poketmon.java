package poketmon;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Poketmon {
    String name;
    int type;
    int level;
    int cp;

    public Poketmon(String name, int type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }

    void showGetMon() {
        System.out.println(name + " [" + type + "] " + "[CP:" + cp + "]");
    }
}
