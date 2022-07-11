package whyrano0524poketmon;

public class PlayGameMain {

    public static void main(String[] args) {
<<<<<<< HEAD
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
=======
        GameManager gm = new GameManager(); //+
        LoginManager lm = LoginManager.getLoginManager();
        BattleMewtwo mewtwo = new BattleMewtwo(); //+

        int choice = 0;
        boolean loginResult = false;

        loginResult=lm.loginStep();
        lm.readPoketmonsFromFile();

        while (loginResult) {
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
            switch (choice) {
                case 0: 
                    MenuViewer.showMainMenu();
                    try {
<<<<<<< HEAD
                        num = GameConst.sc.nextLine().trim();
                        if (num.length() > 0 && num.length() < 2) {
                            choice = Integer.parseInt(num);
                        } else {
                            System.out.println("잘못입력하셨습니다..");
=======
                        String num = GameConst.sc.nextLine().trim();
                        if (num.length() == 1) {
                            choice = Integer.parseInt(num);
                        } else {
                            System.out.println("              잘못입력하셨습니다..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                        } 
                        continue;

                    } catch (NumberFormatException e) {
<<<<<<< HEAD
                        System.out.println("숫자만 입력하세요..");
                    } catch (NullPointerException e) {
                        System.out.println("숫자만 입력하세요..");
=======
                        System.out.println("              숫자만 입력하세요..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    }

                    break;
                case 1:
                	MenuViewer.showCatchMenu();
                    try{
                        if(gm.getPoketmon(Integer.parseInt(GameConst.sc.nextLine()))){
<<<<<<< HEAD
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
=======
                            choice = 3;
                        }else{
                            System.out.println("            메인메뉴로 돌아갑니다..");
                            choice = 0;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("              숫자만 입력하세요...");
                    } catch (NullPointerException e) {
                        System.out.println("              숫자만 입력하세요.....");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("            없는 선택지 입니다...");
                    }
                    break;
                case 2:
                    MenuViewer.showPoketBook();
                    GameConst.sc.nextLine();
                    choice = 0;
                    break;
                case 3:
                	MenuViewer.showPoketBag();
                    gm.showBagInPokekmon();
                    MenuViewer.showPoketBag2();
                    choice = 0; //초기메뉴로 이동
                    break;
                case 4:
                    MenuViewer.deleteMenu(); 
                    try {
                    	gm.showBagInPokekmon();
                        MenuViewer.deleteMenu2();
                        gm.deletePoketmon(Integer.parseInt(GameConst.sc.nextLine()));

                		System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("             숫자만 입력하세요..");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("             빈 가방입니다.." + (GameConst.poketmonBag.size()));
                    }
                    choice = 0; 
                    break;
<<<<<<< HEAD
                case 4:
                	if(GameConst.poketmonBag.size() < 3) {
                		System.out.println("             입장하실 수 없습니다..    　");
=======
                case 5:
                	if(GameConst.poketmonBag.size() < 3) {
                		System.out.println("            입장하실 수 없습니다..    　");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
                		System.out.println();
                		choice = 0;
                		break;
                	}
                	try {
<<<<<<< HEAD
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
=======
                		System.out.println("	  입장하시겠습니까? [Y/N]");
                		System.out.print("	입력 → ");
                		String select=GameConst.sc.nextLine().trim();
                			
                			if("Y".equalsIgnoreCase(select)) {
                				
                				
                				
                				for(int i=0; i<3; i++) { 
                					MenuViewer.vsMenu();
                					gm.showBagInPokekmon(); //내용 출력
                					MenuViewer.vsMenu2();
                					gm.selectVsMewtwo(Integer.parseInt(GameConst.sc.nextLine())); //입력받은 값을 List에 담는다
                					System.out.println();
                					System.out.println("	  선택한 포켓몬은..");
                					for(int j = 0 ; j < GameConst.vsList.size(); j++){ //고른 포켓몬 출력하기
                						
                						Poketmon p = GameConst.vsList.get(j);
                						System.out.println("          ["+(j+1)+"]"+" ["+ p.name +"] [ CP "+p.cp+"]");
                					}
                				}
                		
                				System.out.println();
                				System.out.println("           [TOTAL CP] " + mewtwo.getTotalCp()); //CP합계 출력
                				System.out.println("           [뮤츠의　CP] "+mewtwo.MewtwoCP);
                				mewtwo.battleIf();
                				
                			}else{
                				choice = 0;
                				break;
                			}
                		
                	}catch (NumberFormatException e) {
                		System.out.println("            숫자만 입력하세요..");
                	}
                	System.out.println("            메인메뉴로 돌아갑니다.."); // false일 경우
                	choice = 0;
                	break;
                case 6:
                    System.out.println("            게임을 종료합니다..");
    				lm.savePoketmonsToFile(); //+
    				lm.saveUserToFile(); //+
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
    				return; // 프로그램 종료
            }
        }
    }
}