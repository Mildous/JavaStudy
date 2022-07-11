//package poketmon;
//
//
//public class PlayGameMain {
//
//	public static void main(String[] args) {
//		System.out.println("Hello Poketmon World!");
//		GameManager gm = new GameManager();
//		int choice = 0;
//		boolean loginResult = false;
//		
//		gm.readUserFromFile();
//		while (loginResult == false) {
//			MenuViewer.loginMenu();
//			choice = Integer.parseInt(GameConst.sc.nextLine());
//			switch (choice) {
//			case 1:
//				gm.newLogIn();
//				break;
//			case 2:
//				loginResult = gm.login();
//				choice = 0;
//				break;
//			case 3:
//				System.out.println("종료합니다");
//				gm.saveUserToFile();
//				System.exit(0);
//			}
//		}
//		
//		gm.readPoketmonsFromFile();
//		while (loginResult == true) {
//			switch (choice) {
//			case 0: // 메인메뉴
//				MenuViewer.showMainMenu();
//				try {
//					choice = Integer.parseInt(GameConst.sc.nextLine());
//				} catch (NumberFormatException e) {
//					System.out.println("숫자만 입력하세요..");
//				}
//				break;
//			case 1:
//				MenuViewer.showCatchMenu(); // MenuViewer의 지역메뉴 showCatchMenu()호출
//				if (gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))) {
//					// 입력받은값(int)을 gm의 selectType으로 넘겨주고 getPoketmon()의 반환값이 true일 경우
//					System.out.println("가방에 보관했습니다.."); // 출력
//					choice = 2; // 2번메뉴 실행(가방 전체출력)
//				} else {
//					System.out.println("메인메뉴로 돌아갑니다.."); // false일 경우
//					choice = 0; // 0번메뉴 실행(초기메뉴)
//				}
//				break;
//			case 2:
//				gm.showBagInPokekmon(); // 가방의 내용 전체출력
//				choice = 0; // 초기메뉴로 이동
//				break;
//			case 3:
//				MenuViewer.deleteMenu(); // 저장된 값을 삭제하는 deleteMenu()메서드 호출
//				try { // 예외처리
//					gm.showBagInPokekmon(); // 내용 출력
//					System.out.print("-> "); // 삭제할 넘버를 입력받는다
//					gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));
//					System.out.println("오박사에게 보냈습니다..");
//				} catch (NumberFormatException e) { // 숫자가 아닐경우
//					System.out.println("숫자만 입력하세요..");
//				} catch (IndexOutOfBoundsException e) {
//					System.out.println("빈 가방입니다.." + (GameConst.poketmonBag.size())); // 가방이 비었을 경우
//				}
//				choice = 0; // 초기메뉴로 이동
//				break;
//			case 4:
//				if (GameConst.poketmonBag.size() < 3) {
//					System.out.println("입장하실 수 없습니다. (잡은포켓몬 3마리미만)");
//					choice = 0;
//					break;
//				}
//				gm.fightMewTwo();
//				choice = 0;
//				break;
//			case 5:
//				System.out.println("게임종료..");
//				gm.savePoketmonsToFile();
//				gm.saveUserToFile();
//				return; // 프로그램 종료
//			}
//		}
//	}
//}

package poketmon;

import java.util.List;

public class PlayGameMain {

    public static void main(String[] args) {
        GameManager gm = new GameManager();
        BattleMewtwo mewtwo = new BattleMewtwo();
        
        int choice = 0;
        boolean loginResult = false;
        String num;
        
        gm.readUserFromFile();
		while (loginResult == false) {
			MenuViewer.loginMenu();
			choice = Integer.parseInt(GameConst.sc.nextLine());
			switch (choice) {
			case 1:
				gm.newLogIn();
				break;
			case 2:
				loginResult = gm.login();
				choice = 0;
				break;
			case 3:
				System.out.println("종료합니다");
				gm.saveUserToFile();
				System.exit(0);
            }
        }
        gm.readPoketmonsFromFile();
        while (loginResult == true) {
            switch (choice) {
                case 0: 
                    MenuViewer.showMainMenu();
                    try {
                        num = GameConst.sc.nextLine().trim();
                        if (num.length() > 0 && num.length() < 2) {
                            choice = Integer.parseInt(num);
                        } else {
                            System.out.println("잘못입력하셨습니다..");
                        } 
                        continue;

                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력하세요..");
                    } catch (NullPointerException e) {
                        System.out.println("숫자만 입력하세요..");
                    }

                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    try{
                        if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
                            choice = 2; 
                        }else{
                            System.out.println("             메인메뉴로 돌아갑니다.."); 
                            choice = 0;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력하세요...");
                    } catch (NullPointerException e) {
                        System.out.println("숫자만 입력하세요.....");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("없는 선택지 입니다...");
                    }
                    break;
                case 2:
                    gm.showBagInPokekmon();
                    choice = 0; //초기메뉴로 이동
                    break;
                case 3:
                    MenuViewer.deleteMenu(); 
                    try {
                    	gm.showBagInPokekmon();
                        gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));
                		System.out.println("             오박사에게 보냈습니다..     ");
                		System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력하세요..");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("             빈 가방입니다.." + (GameConst.poketmonBag.size()));
                    }
                    choice = 0; 
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
                			MenuViewer.vsMenu();
                			gm.showBagInPokekmon(); //내용 출력
                			gm.selectVsMewtwo(Integer.parseInt(GameConst.sc.nextLine())); //입력받은 값을 List에 담는다
                		
                			for(int j = 0 ; j < GameConst.vsList.size(); j++){ //고른 포켓몬 출력하기
                				Poketmon p = GameConst.vsList.get(j);
                				System.out.println("           ["+(j+1)+"]"+" ["+ p.name +"] [ CP "+p.cp+"]");
                			}
                		}
                		System.err.println();
                		System.out.println("           [TOTAL CP] " + mewtwo.getTotalCp()); //CP합계 출력
                		System.out.println("           [뮤츠의　CP] "+mewtwo.MewtwoCP);
                		mewtwo.battleIf();
                	}catch (NumberFormatException e) {
                		System.out.println("            숫자만 입력하세요..");
                	}
                	System.out.println("             메인메뉴로 돌아갑니다.."); // false일 경우
                	choice = 0;
                	break;
                case 5:
                    System.out.println("            게임을 종료합니다..");
    				gm.savePoketmonsToFile();
    				gm.saveUserToFile();
    				return; // 프로그램 종료
            }
        }
    }
}