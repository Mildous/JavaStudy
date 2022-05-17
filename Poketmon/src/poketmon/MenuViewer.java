package poketmon;

import java.util.Scanner;

public class MenuViewer {
    static Scanner sc = new Scanner(System.in);

    static void showMenu() { //메인메뉴 출력
        System.out.println("== Pokemon World! ==");
        System.out.println("1. 포켓몬 잡기");
        System.out.println("2. 포켓몬 가방");
        System.out.println("3. 게임종료");
        System.out.print("-> ");
    }
}