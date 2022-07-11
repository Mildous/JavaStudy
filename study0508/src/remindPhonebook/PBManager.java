package remindPhonebook;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class PBManager {

    final int MAX_CNT = 100;
    Person[] infoStorage = new Person[MAX_CNT];
    int curCnt = 0;

    void reWriteData(){
        System.out.println("Rewrite name..");
        String name = MenuViewer.sc.nextLine();
        int index = -1;
        index  = search(name);

        if(index > -1){
            System.out.println("Rewrite Number..");
            String num = MenuViewer.sc.nextLine();
            System.out.println("Rewrite birth..");
            String birth = MenuViewer.sc.nextLine();
            infoStorage[index].birth = birth;
            System.out.println("update complete..");
        } else {
            System.out.println("not found name...");
        }
    }

    void deleteData(){
        System.out.println("Delete name is... ");
        String name = MenuViewer.sc.nextLine();
        int index = -1;
        index = search(name);

        if(index > -1){
            for(int i=index; i<curCnt; i++){
                infoStorage[i] = infoStorage[i+1];
            }
            curCnt--;
            System.out.println("Delete complete...");
        } else {
            System.out.println("Not found name...");
        }

    }

    void searchData(){
        System.out.println("name to search..");
        String name = MenuViewer.sc.nextLine();
        int index = -1;
        index = search(name);
        if(index > -1){
            infoStorage[index].showPhoneInfo();
        } else {
            System.out.println("name is not found..");
        }

    }
    private int search(String name){
        for(int i=0; i<curCnt; i++){
            if(name.equals(infoStorage[i].name)){
                return i;
            }
        }
        return -1;
    }
    void showAlldata(){
       for(int i=0; i<curCnt; i++){
           infoStorage[i].showPhoneInfo();
       }
    }
    void inputData(){
        System.out.print("name: ");
        String name = MenuViewer.sc.nextLine();
        System.out.print("number: ");
        String num =  MenuViewer.sc.nextLine();
        System.out.print("birth: ");
        String birth = MenuViewer.sc.nextLine();

        infoStorage[curCnt++] = new Person(name, num, birth);   //
        System.out.println("Complete..");
    }

}
