package P_Diagram;

import java.util.ArrayList;

public class PoketmonManager {

    ArrayList<Poketmon> poketmonBag = new ArrayList<Poketmon>();
    ArrayList<Poketmon> allPoketmons = new ArrayList<Poketmon>();
    ArrayList<Poketmon> fieldmons = new ArrayList<Poketmon>();
    int choice = 0;
    int choice2 = 0;
    String choice3 = "";
    Poketmon tmp;

    private static PoketmonManager bag;

    private PoketmonManager() {
    }

    public static PoketmonManager getPoketMonBag() {
        if (bag == null) {
            bag = new PoketmonManager();
        }
        return bag;
    }

    Poketmon catchPoketmon() {
        if (bag.poketmonBag.size() == 10) {
            System.out.println("진입불가");
            System.out.println("포켓몬가방이 꽉찼어요.");
            return null;
        }
        Menu.placeMenu();
        choice = Integer.parseInt(Menu.sc.nextLine());
        bag.makePoketmons();
        switch (choice) {
            case 1:
                System.out.println();
                System.out.println("<<저 푸른 초원>>");
                System.out.println("  환영합니다!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("풀")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " 등장!!");
                System.out.println("잡으시겠습니까? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("잡았습니다!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("실패했습니다.");
                        System.out.println("메뉴로돌아갑니다.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }

                } else {
                    System.out.println("메뉴로돌아갑니다.");
                    return null;
                }
            case 2:
                System.out.println();
                System.out.println("<<뜨거운사막지대>>");
                System.out.println("  환영합니다!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("불")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " 등장!!");
                System.out.println("잡으시겠습니까? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("잡았습니다!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("실패했습니다.");
                        System.out.println("메뉴로돌아갑니다.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("메뉴로돌아갑니다.");
                    return null;
                }

            case 3:
                System.out.println();
                System.out.println("<<제주도 푸른 바다>>");
                System.out.println("  환영합니다!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("물")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " 등장!!");
                System.out.println("잡으시겠습니까? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("잡았습니다!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("실패했습니다.");
                        System.out.println("메뉴로돌아갑니다.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("메뉴로돌아갑니다.");
                    return null;
                }

            case 4:
                System.out.println();
                System.out.println("<<한국 전력공사>>");
                System.out.println("  환영합니다!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("전기")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " 등장!!");
                System.out.println("잡으시겠습니까? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("잡았습니다!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("실패했습니다.");
                        System.out.println("메뉴로돌아갑니다.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("메뉴로돌아갑니다.");
                    return null;
                }

            default:
                return null;
        }
        //return tmp;
    }

    void showBag() {
        if (!poketmonBag.isEmpty()) {
            for (int i = 0; i < poketmonBag.size(); i++) {
                System.out.println("[" + (i + 1) + "번" + poketmonBag.get(i) + "]" + " ");
            }
            System.out.println();
        } else {
            System.out.println("잡은 포켓몬이 없습니다.");
        }
    }

    void deletePoketMon() {
        int choice = 0;
        System.out.println("삭제할 포켓몬의 번호를 입력하세요");
        choice = Integer.parseInt(Menu.sc.nextLine());
        poketmonBag.remove(choice - 1);
        System.out.println("삭제가 완료되었습니다.");
    }

    void makePoketmons() {
        //-------------------------------불
        allPoketmons.add(new Piri());
        allPoketmons.add(new Sixtail());
        allPoketmons.add(new Gady());
        //-------------------------------풀
        allPoketmons.add(new Yeesanghaessi());
        allPoketmons.add(new Paras());
        allPoketmons.add(new Ttubuckcho());
        //-------------------------------물
        allPoketmons.add(new Ggobugi());
        allPoketmons.add(new Balcheangyee());
        allPoketmons.add(new Golapaduck());
        //-------------------------------전기
        allPoketmons.add(new Pikachu());
        allPoketmons.add(new Coil());
        allPoketmons.add(new Jjiririgong());
    }

    void fight() { //뮤츠와 대전하기
        int choice = 0;
        int power = 0;
        if (poketmonBag.size() >= 3) {
            Mewtwo mewtwo = new Mewtwo();
            System.out.println("뮤츠 등장!!!!!!!!!!우와!!!!");
            System.out.println(mewtwo);
            System.out.println("대전할 포켓몬을 선택하세요 3마리까지 가능");
            bag.showBag();
            System.out.println("1번 대전 포켓몬을 입력하세요.");
            choice = Integer.parseInt(Menu.sc.nextLine());
            power = poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "선택완료!");
            poketmonBag.remove(choice - 1);
            bag.showBag();
            System.out.println("2번 대전 포켓몬을 입력하세요.");
            choice = Integer.parseInt(Menu.sc.nextLine());
            power += poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "선택완료!");
            poketmonBag.remove(choice - 1);
            System.out.println("3번 대전 포켓몬을 입력하세요.");
            bag.showBag();
            choice = Integer.parseInt(Menu.sc.nextLine());
            power += poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "선택완료!");
            poketmonBag.remove(choice - 1);

            if (power > mewtwo.power) {
                System.out.println("승리!!!!!!!!!!!");
                return;
            } else {
                System.out.println("패배하였습니다.");
                return;
            }
        } else {
            System.out.println("포켓몬이 3마리 이상필요합니다.");
            return;
        }
    }

}