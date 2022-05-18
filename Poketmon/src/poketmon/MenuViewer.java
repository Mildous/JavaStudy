package poketmon;

import java.util.Scanner;

public class MenuViewer {


    static void showMainMenu() { //메인메뉴 출력
        System.out.println("== Pokemon World! ==");
        System.out.println("1. 포켓몬 잡기");
        System.out.println("2. 포켓몬 가방");
        System.out.println("3. 포켓몬 삭제");
        System.out.println("4. 게임종료");
        System.out.print("-> ");
    }

    static void showCatchMenu() { //메인메뉴 출력
        System.out.println("== select field! ==");
        System.out.println("1. 초원");
        System.out.println("2. 사막");
        System.out.println("3. 바다");
        System.out.println("4. 전기");
        System.out.print("-> ");
    }

    static void deleteMenu() {
        System.out.println("삭제할 번호를 입력하세요");
        System.out.print("-> ");
    }


}