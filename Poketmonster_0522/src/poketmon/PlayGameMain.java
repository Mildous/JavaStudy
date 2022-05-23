package poketmon;

import java.util.List;

public class PlayGameMain {

    public static void main(String[] args) {
        GameManager gm = new GameManager();
        int choice = 0; 
        
        while (true) {
            switch (choice) {
                case 0: //메인메뉴
                    MenuViewer.showMainMenu();
                    try {
                        choice = Integer.parseInt(GameConst.sc.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("             숫자만 입력하세요..");
                    }
                    break;
                case 1:
                	MenuViewer.showCatchMenu(); //MenuViewer의 지역메뉴 showCatchMenu()호출
                    if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
                        //입력받은값(int)을 gm의 selectType으로 넘겨주고 getPoketmon()의 반환값이 true일 경우
                        choice = 2; //2번메뉴 실행(가방 전체출력)
                    }else{
                        System.out.println("             메인메뉴로 돌아갑니다.."); // false일 경우
                        choice = 0; //0번메뉴 실행(초기메뉴)
                    }
                    break;
                case 2:
                    gm.showBagInPokekmon(); //가방의 내용 전체출력
                    choice = 0; //초기메뉴로 이동
                    break;
                case 3:
                    MenuViewer.deleteMenu(); //저장된 값을 삭제하는 deleteMenu()메서드 호출
                    try { //예외처리
                    	gm.showBagInPokekmon(); //내용 출력
                        gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));
                		System.out.println("             오박사에게 보냈습니다..     ");
                		System.out.println();
                    }catch (NumberFormatException e){ //숫자가 아닐경우
                        System.out.println("             숫자만 입력하세요..");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("             빈 가방입니다.." + (GameConst.poketmonBag.size())); //가방이 비었을 경우
                    }
                    choice = 0; //초기메뉴로 이동
                    break;
                case 4:
                	if(GameConst.poketmonBag.size() < 3) {
                		System.out.println("             입장하실 수 없습니다..    　");
                		System.out.println();
                		choice = 0;
                		break;
                	}
                	try {
                		for(int i=0; i<3; i++) { 
                			System.out.println("             대결할 포켓몬을 고르세요..");
                			gm.showBagInPokekmon(); //내용 출력
                			gm.selectVsMewtwo(Integer.parseInt(GameConst.sc.nextLine())); //입력받은 값을 List에 담는다
                		
                			for(int j = 0 ; j < GameConst.vsList.size(); j++){ //고른 포켓몬 출력하기
                				Poketmon p = GameConst.vsList.get(j);
                				System.out.println("             ["+(j+1)+"]"+" ["+ p.name +"] [ CP "+p.cp+"]");
                			}
                		}
                		System.out.println("             TOTAL " + gm.getTotalCp()); //CP합계 출력
                		if(gm.getTotalCp() > 200) { //뮤츠 CP설정, 이겼을 경우
                			System.out.println();
                			System.out.println("                     승리!");
                			System.out.println();
                		}else {
                			System.out.println();
                			System.out.println("                     패배..");
                			System.out.println();
                		}
                	}catch (NumberFormatException e) {
                		System.out.println("            숫자만 입력하세요..");
                	}
                	System.out.println("            메인메뉴로 돌아갑니다.."); // false일 경우
                	choice = 0;
                	break;
                case 5:
                    System.out.println("            게임을 종료합니다..");
                    return; //프로그램 종료
            }
        }
    }
}