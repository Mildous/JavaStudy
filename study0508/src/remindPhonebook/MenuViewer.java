package remindPhonebook;

import java.util.Scanner;

public class MenuViewer {
    static Scanner sc = new Scanner(System.in);
    static void showMenu(){
        System.out.println("===== MENU =====");
        System.out.println("1. Insert Data");
        System.out.println("2. Search Data");
        System.out.println("3. Rewrite Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Show all Data");
        System.out.println("6. Exit........");
        System.out.print("---> ");
    }
}
