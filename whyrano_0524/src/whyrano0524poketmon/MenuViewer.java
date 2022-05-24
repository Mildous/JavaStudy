package whyrano0524poketmon;

public class MenuViewer {


	static void showMainMenu() { //메인메뉴 출력
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("     ◆ ＰＯＫＥＴＭＯＮ　ＷＯＲＬＤ ◆    ");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("        ┌─────────────────┐");
		System.out.println("        │ ① 포켓몬　잡기    │");
		System.out.println("        │ ② 포켓몬　도감    │");
		System.out.println("        │ ③ 포켓몬　가방    │");
		System.out.println("        │ ④ 가방　정리　    │");
		System.out.println("        │ ⑤ 뮤츠와　대결    │");
		System.out.println("        │ ⑥ 게임　종료　    │");
		System.out.println("        └─────────────────┘");

    }

    static void showCatchMenu() { //지역메뉴 출력 - 지역별로 출몰하는 포켓몬의 타입이 다름
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("             ◆  M A P ◆    ");
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println("        ┌──────────────────┐");
		System.out.println("        │ ① 저~~　푸른 초원  │");
		System.out.println("        │ ② 뜨거운　사막지대  │");
		System.out.println("        │ ③ 제주도 푸른바다   │");
		System.out.println("        │ ④ 한국전력공사     │");
		System.out.println("        └──────────────────┘");

    }

    static void deleteMenu() { //삭제하기
        System.out.println("내보낼 포켓몬을 고르세요");
    }
    
    static void loginMenu() {
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.종료");
	}
    
    static void vsMenu() {
    	System.out.println("         ==========================　");
    	System.out.println("           대결할 포켓몬을 고르세요..     ");
    	System.out.println("         ==========================　");
    }

	static void showPoketBook() { //포켓몬 도감
		System.out.println("<<풀 포켓몬>>");
		System.out.println("이름ㅤㅤ:ㅤ이상해씨ㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ파라스ㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ뚜벅초");
		System.out.println("타입ㅤㅤ:ㅤ풀ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ풀ㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ풀");
		System.out.println("서식지ㅤ:ㅤ저ㅤ푸른ㅤ초원ㅤㅤㅤ서식지ㅤ:ㅤ저ㅤ푸른ㅤ초원ㅤㅤ서식지ㅤ:ㅤ저ㅤ푸른ㅤ초원");
		System.out.println("공격력ㅤ:ㅤ210~500ㅤㅤㅤㅤ 공격력ㅤ:ㅤ80~200ㅤㅤ  ㅤ공격력ㅤ:ㅤ10~100");
		System.out.println();
		System.out.println("<<불 포켓몬>>");
		System.out.println("이름ㅤㅤ:ㅤ파이리ㅤㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ식스테일ㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ가디");
		System.out.println("타입ㅤㅤ:ㅤ불ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ불ㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ불");
		System.out.println("서식지ㅤ:ㅤ뜨거운ㅤ사막지대ㅤㅤ서식지ㅤ:ㅤ뜨거운ㅤ사막지대ㅤ서식지ㅤ: 뜨거운ㅤ사막지대");
		System.out.println("공격력ㅤ:ㅤ210~500ㅤㅤㅤㅤ 공격력ㅤ:ㅤ80~200ㅤㅤ  ㅤ공격력ㅤ:ㅤ10~100");
		System.out.println();
		System.out.println("<<물 포켓몬>>");
		System.out.println("이름ㅤㅤ:ㅤ꼬부기ㅤㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ발챙이ㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ고라파덕");
		System.out.println("타입ㅤㅤ:ㅤ물ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ물ㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ물");
		System.out.println("서식지ㅤ:ㅤ제주도ㅤ푸른바다ㅤㅤ서식지ㅤ:ㅤ제주도ㅤ푸른바다ㅤ서식지ㅤ: 제주도ㅤ푸른바다");
		System.out.println("공격력ㅤ:ㅤ210~500ㅤㅤㅤㅤ 공격력ㅤ:ㅤ80~200ㅤㅤ  ㅤ공격력ㅤ:ㅤ10~100");
		System.out.println();
		System.out.println("<<전기 포켓몬>>");
		System.out.println("이름ㅤㅤ:ㅤ피카츄ㅤㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ코일ㅤㅤㅤㅤㅤㅤㅤㅤ이름ㅤ:ㅤ찌리리공");
		System.out.println("타입ㅤㅤ:ㅤ전기ㅤㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ전기ㅤㅤㅤㅤㅤㅤㅤㅤ타입ㅤ:ㅤ전기");
		System.out.println("서식지ㅤ:ㅤ한국전력공사ㅤㅤㅤㅤ서식지ㅤ:ㅤ한국전력공사ㅤㅤㅤ서식지ㅤ:ㅤ한국전력공사");
		System.out.println("공격력ㅤ:ㅤ210~500ㅤㅤㅤㅤ 공격력ㅤ:ㅤ80~200ㅤㅤ  ㅤ공격력ㅤ:ㅤ10~100");
		System.out.println();
		System.out.println();
		System.out.println("메뉴로 돌아가려면 아무키나 눌러주세요.");

	}
}