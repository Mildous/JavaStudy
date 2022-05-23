package poketmon;

public class MenuViewer {


    static void showMainMenu() { //메인메뉴 출력
        System.out.println("===== MENU =====");
        System.out.println("1. 포켓몬 잡기"); //showCatchMenu로
        System.out.println("2. 포켓몬 가방"); //showBagInPokekmon()으로
        System.out.println("3. 가방 정리"); //deletePoketmon()으로
        System.out.println("4. 뮤츠와의 대결");
        System.out.println("5. 게임 종료"); //프로그램 종료
        System.out.print("-> ");
    }

    static void showCatchMenu() { //지역메뉴 출력 - 지역별로 출몰하는 포켓몬의 타입이 다름
        System.out.println("===== MAP ======");
        System.out.println("1. 저 푸른 초원"); //1-풀
        System.out.println("2. 뜨거운 사막지대"); //2-불
        System.out.println("3. 제주도 푸른 바다"); //3-물
        System.out.println("4. 한국전력공사"); //4-전기
        System.out.print("-> ");
    }

    static void deleteMenu() { //삭제하기
        System.out.println("내보낼 포켓몬을 고르세요");
    }

}