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

    public Poketmon(String name, int type, int level){
        this.name = name;
        this.type = type;
        this.level= level;
    }

    void showGetMon() {
        System.out.println(name+" ["+type+"] "+"[CP:"+cp+"]");
    }

    public static void main(String[] args) {
        int[] score = {100, 90, 95, 85, 50};

        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream("score.dat");
            dos = new DataOutputStream(fos);
            for (int j : score) {
                dos.writeInt(j);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found..");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("data write i/o exception..");
        } finally {
            try {
                Objects.requireNonNull(fos).close();
                Objects.requireNonNull(dos).close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("stream close fail..");
            }
        }

    }
}
