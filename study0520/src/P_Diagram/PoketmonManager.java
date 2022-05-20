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
            System.out.println("���ԺҰ�");
            System.out.println("���ϸ󰡹��� ��á���.");
            return null;
        }
        Menu.placeMenu();
        choice = Integer.parseInt(Menu.sc.nextLine());
        bag.makePoketmons();
        switch (choice) {
            case 1:
                System.out.println();
                System.out.println("<<�� Ǫ�� �ʿ�>>");
                System.out.println("  ȯ���մϴ�!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("Ǯ")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " ����!!");
                System.out.println("�����ðڽ��ϱ�? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("��ҽ��ϴ�!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("�����߽��ϴ�.");
                        System.out.println("�޴��ε��ư��ϴ�.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }

                } else {
                    System.out.println("�޴��ε��ư��ϴ�.");
                    return null;
                }
            case 2:
                System.out.println();
                System.out.println("<<�߰ſ�縷����>>");
                System.out.println("  ȯ���մϴ�!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("��")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " ����!!");
                System.out.println("�����ðڽ��ϱ�? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("��ҽ��ϴ�!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("�����߽��ϴ�.");
                        System.out.println("�޴��ε��ư��ϴ�.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("�޴��ε��ư��ϴ�.");
                    return null;
                }

            case 3:
                System.out.println();
                System.out.println("<<���ֵ� Ǫ�� �ٴ�>>");
                System.out.println("  ȯ���մϴ�!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("��")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " ����!!");
                System.out.println("�����ðڽ��ϱ�? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("��ҽ��ϴ�!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("�����߽��ϴ�.");
                        System.out.println("�޴��ε��ư��ϴ�.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("�޴��ε��ư��ϴ�.");
                    return null;
                }

            case 4:
                System.out.println();
                System.out.println("<<�ѱ� ���°���>>");
                System.out.println("  ȯ���մϴ�!!  ");
                for (int i = 0; i < allPoketmons.size(); i++) {
                    if (allPoketmons.get(i).attribute.equals("����")) {
                        fieldmons.add(allPoketmons.get(i));
                    }
                }
                System.out.println();
                choice2 = Menu.random.nextInt(0, fieldmons.size());

                System.out.println(fieldmons.get(choice2) + " ����!!");
                System.out.println("�����ðڽ��ϱ�? (y/n)");

                choice3 = Menu.sc.nextLine();
                if (choice3.equals("y")) {
                    if (Menu.random.nextInt(0, 101) <= fieldmons.get(Menu.random.nextInt(0, fieldmons.size())).percent) {
                        System.out.println("��ҽ��ϴ�!");
                        tmp = fieldmons.get(choice2);
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return tmp;
                    } else {
                        System.out.println("�����߽��ϴ�.");
                        System.out.println("�޴��ε��ư��ϴ�.");
                        allPoketmons.removeAll(allPoketmons);
                        fieldmons.removeAll(fieldmons);
                        return null;
                    }
                } else {
                    System.out.println("�޴��ε��ư��ϴ�.");
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
                System.out.println("[" + (i + 1) + "��" + poketmonBag.get(i) + "]" + " ");
            }
            System.out.println();
        } else {
            System.out.println("���� ���ϸ��� �����ϴ�.");
        }
    }

    void deletePoketMon() {
        int choice = 0;
        System.out.println("������ ���ϸ��� ��ȣ�� �Է��ϼ���");
        choice = Integer.parseInt(Menu.sc.nextLine());
        poketmonBag.remove(choice - 1);
        System.out.println("������ �Ϸ�Ǿ����ϴ�.");
    }

    void makePoketmons() {
        //-------------------------------��
        allPoketmons.add(new Piri());
        allPoketmons.add(new Sixtail());
        allPoketmons.add(new Gady());
        //-------------------------------Ǯ
        allPoketmons.add(new Yeesanghaessi());
        allPoketmons.add(new Paras());
        allPoketmons.add(new Ttubuckcho());
        //-------------------------------��
        allPoketmons.add(new Ggobugi());
        allPoketmons.add(new Balcheangyee());
        allPoketmons.add(new Golapaduck());
        //-------------------------------����
        allPoketmons.add(new Pikachu());
        allPoketmons.add(new Coil());
        allPoketmons.add(new Jjiririgong());
    }

    void fight() { //������ �����ϱ�
        int choice = 0;
        int power = 0;
        if (poketmonBag.size() >= 3) {
            Mewtwo mewtwo = new Mewtwo();
            System.out.println("���� ����!!!!!!!!!!���!!!!");
            System.out.println(mewtwo);
            System.out.println("������ ���ϸ��� �����ϼ��� 3�������� ����");
            bag.showBag();
            System.out.println("1�� ���� ���ϸ��� �Է��ϼ���.");
            choice = Integer.parseInt(Menu.sc.nextLine());
            power = poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "���ÿϷ�!");
            poketmonBag.remove(choice - 1);
            bag.showBag();
            System.out.println("2�� ���� ���ϸ��� �Է��ϼ���.");
            choice = Integer.parseInt(Menu.sc.nextLine());
            power += poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "���ÿϷ�!");
            poketmonBag.remove(choice - 1);
            System.out.println("3�� ���� ���ϸ��� �Է��ϼ���.");
            bag.showBag();
            choice = Integer.parseInt(Menu.sc.nextLine());
            power += poketmonBag.get(choice - 1).power;
            System.out.println(poketmonBag.get(choice - 1) + "���ÿϷ�!");
            poketmonBag.remove(choice - 1);

            if (power > mewtwo.power) {
                System.out.println("�¸�!!!!!!!!!!!");
                return;
            } else {
                System.out.println("�й��Ͽ����ϴ�.");
                return;
            }
        } else {
            System.out.println("���ϸ��� 3���� �̻��ʿ��մϴ�.");
            return;
        }
    }

}