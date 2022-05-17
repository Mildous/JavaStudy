package pokemon_Ver01;

import java.util.Scanner;

public class MenuViewer {
    static Scanner sc = new Scanner(System.in);

    static void showMenu() { //메인메뉴 출력
        System.out.println("== Pokemon World! ==");
        System.out.println("1. 포켓몬 잡기");
        System.out.println("2. 포켓몬 가방");
        System.out.println("3. 포켓몬 도감");
        System.out.println("4. 박사님께 보내기");
        System.out.println("5. 뮤츠와의 대결");
        System.out.println("6. 게임종료");
        System.out.print("=> ");
    }
}