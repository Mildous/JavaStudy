package poketmon_mini_game;

public class MenuViewer {


    static void showMainMenu() { //메인메뉴 출력
        System.out.println("===== MENU =====");
        System.out.println("1. 포켓몬 잡기");
        System.out.println("2. 포켓몬 가방");
        System.out.println("3. 가방 정리");
        System.out.println("4. 게임 종료");
        System.out.print("-> ");
    }

    static void showCatchMenu() { //출몰할 포켓몬을 나눈 지역메뉴 출력
        System.out.println("===== MAP ======");
        System.out.println("1. 저 푸른 초원");
        System.out.println("2. 뜨거운 사막지대");
        System.out.println("3. 제주도 푸른 바다");
        System.out.println("4. 한국전력공사");
        System.out.print("-> ");
    }

    static void deleteMenu() { //삭제하기
        System.out.println("내보낼 포켓몬을 고르세요");
    }


}