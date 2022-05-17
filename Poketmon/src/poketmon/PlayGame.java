package poketmon;

import java.util.Scanner;

public class PlayGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GameManager gm = new GameManager();

        int choice = 0;
        while (true) {
            MenuViewer.showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: //서브메뉴 출력
                    break;
                case 2:
                    gm.PoketBag(); //잡은 포켓몬을 저장한 가방의 전체 내용을 출력한다
                    break;
                case 3:
                    System.out.println("게임종료");
                    return; //프로그램을 종료한다.
            }
        }
    }
}