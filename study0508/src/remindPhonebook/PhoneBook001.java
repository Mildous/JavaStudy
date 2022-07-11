package remindPhonebook;

import java.util.Scanner;

public class PhoneBook001 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        PBManager pm = new PBManager();     //

        int choice = 0;

        while(true){
            MenuViewer.showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    pm.inputData();
                    break;
                case 2:
                    pm.searchData();
                    break;
                case 3:
                    pm.reWriteData();
                    break;
                case 4:
                    pm.deleteData();
                    break;
                case 5:
                    pm.showAlldata();
                    break;
                case 6:
                    System.out.println("End programs..");
                    return;
            }
        }
    }

}
