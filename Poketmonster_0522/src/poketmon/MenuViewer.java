package poketmon;

public class MenuViewer {


    static void showMainMenu() { //메인메뉴 출력
    	System.out.println("         ==========================　");
		System.out.println("               POKETMONSTER     　   ");
		System.out.println("         ==========================　");
		System.out.println("               1. 포켓몬 잡기          ");
		System.out.println("               2. 포켓몬 가방          ");
		System.out.println("               3. 가방　 정리          ");
		System.out.println("               4. 뮤츠와 대결          ");
		System.out.println("               5. 게임　 종료          ");
		
    }

    static void showCatchMenu() { //지역메뉴 출력 - 지역별로 출몰하는 포켓몬의 타입이 다름
        System.out.println("         ==========================　");
		System.out.println("              🏕 지역을 선택하세요     　");
		System.out.println("         ==========================　");
		System.out.println("              1. 저 푸른 초원          ");
		System.out.println("              2. 뜨거운 사막지대        ");
		System.out.println("              3. 제주도 푸른 바다       ");
		System.out.println("              4. 한국전력공사　         ");
    }

    static void deleteMenu() { //삭제하기
        System.out.println("         ==========================　");
		System.out.println("            내보낼 포켓몬을 선택하세요　   ");
		System.out.println("         ==========================　");
    }
    
    static void vsMenu() {
    	System.out.println("         ==========================　");
    	System.out.println("           대결할 포켓몬을 고르세요..     ");
    	System.out.println("         ==========================　");
    }

}