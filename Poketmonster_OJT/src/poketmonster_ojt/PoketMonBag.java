package poketmonster_ojt;

import java.util.ArrayList;

public class PoketMonBag {
	
	ArrayList<PoketMon> poketmonBag = new ArrayList<PoketMon>();
	ArrayList<PoketMon> allPoketmons = new ArrayList<PoketMon>();
	ArrayList<PoketMon> fieldmons = new ArrayList<PoketMon>();
	int choice = 0;
	int choice2 = 0;
	String choice3 = "";
	PoketMon tmp;
	
	private static PoketMonBag bag;
	
	private PoketMonBag() {}
	
	public static PoketMonBag getPoketMonBag() {
		if(bag==null) {
			bag=new PoketMonBag();
		}
		return bag;
	}
	
	PoketMon catchPoketmon() {
		if(bag.poketmonBag.size()==10) {
			System.out.println("���ԺҰ�");
			System.out.println("���ϸ󰡹��� ��á���.");
			return null;
		}
		PlaceMenu.placeMenu();
		choice=Integer.parseInt(Read.sc.nextLine());
		bag.makePoketmons();
		switch(choice) {
		case 1:
			System.out.println();
			System.out.println("<<�߰ſ�縷����>>");
			System.out.println("  ȯ���մϴ�!!  ");
			for(int i=0; i<allPoketmons.size(); i++) {
				if(allPoketmons.get(i).attribute.equals("��")) {
					fieldmons.add(allPoketmons.get(i));
				}
			}
			System.out.println();
			choice2=Random.random.nextInt(0,fieldmons.size());
			
			if(choice2==0) {
				System.out.println(allPoketmons.get(choice2)+" ����!!");
				System.out.println("�����ðڽ��ϱ�?");
				
				choice3=Read.sc.nextLine();
				if(choice3.equals("y")) {
					if(Random.random.nextInt(0, 101)<=allPoketmons.get(Random.random.nextInt(0, allPoketmons.size())).percent) {
						System.out.println("��ҽ��ϴ�!");
						tmp=allPoketmons.get(choice2);
						allPoketmons.removeAll(allPoketmons);
						fieldmons.removeAll(fieldmons);
						return tmp;
					}else {
						System.out.println("�����߽��ϴ�.");
						System.out.println("�޴��ε��ư��ϴ�.");
						allPoketmons.removeAll(allPoketmons);
						fieldmons.removeAll(fieldmons);
						return null;
					}
				}else {
					System.out.println("�޴��ε��ư��ϴ�.");
					return null;
				}
			}else if(choice2==1) {
				System.out.println(allPoketmons.get(choice2)+"����!!");
				System.out.println("�����ðڽ��ϱ�?");
				choice3=Read.sc.nextLine();
				if(choice3.equals("y")) {
					if(Random.random.nextInt(0, 101)<=allPoketmons.get(Random.random.nextInt(0, allPoketmons.size())).percent) {
						System.out.println("��ҽ��ϴ�!");
						tmp=allPoketmons.get(choice2);
						allPoketmons.removeAll(allPoketmons);
						fieldmons.removeAll(fieldmons);
						return tmp;
					}else {
						System.out.println("�����߽��ϴ�.");
						System.out.println("�޴��ε��ư��ϴ�.");
						allPoketmons.removeAll(allPoketmons);
						fieldmons.removeAll(fieldmons);
						return null;
					}
				}else {
					System.out.println("�޴��ε��ư��ϴ�.");
					return null;
				}
			}
			break;
			default :
				return null;
		}
		return tmp;
	}
	
	void showBag() {
		if(!poketmonBag.isEmpty()) {	
			for(int i=0; i<poketmonBag.size();i++) {
				System.out.println("["+(i+1)+"�� "+poketmonBag.get(i)+"]"+" ");
			}
			System.out.println();
		}else {
			System.out.println("���� ���ϸ��� �����ϴ�.");
		}
	}
	
	void deletePoketMon() {
		int choice=0;
		System.out.println("������ ���ϸ��� ��ȣ�� �Է��ϼ���");
		choice=Integer.parseInt(Read.sc.nextLine());
		poketmonBag.remove(choice-1);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	void makePoketmons() {
		allPoketmons.add(new Piri());
		allPoketmons.add(new Booster());
	}
	
	void fight() {
		int choice=0;
		int power=0;
		Mewtwo mewtwo= new Mewtwo();
		System.out.println("���� ����!!!!!!!!!!���!!!!");
		System.out.println(mewtwo);
		System.out.println("������ ���ϸ��� �����ϼ��� 3�������� ����");
		bag.showBag();
		System.out.println("1�� ���� ���ϸ��� �Է��ϼ���.");
		choice=Integer.parseInt(Read.sc.nextLine());
		power=poketmonBag.get(choice-1).power;
		System.out.println(poketmonBag.get(choice-1)+"���ÿϷ�!");
		poketmonBag.remove(choice-1);
		bag.showBag();
		System.out.println("2�� ���� ���ϸ��� �Է��ϼ���.");
		choice=Integer.parseInt(Read.sc.nextLine());
		power+=poketmonBag.get(choice-1).power;
		System.out.println(poketmonBag.get(choice-1)+"���ÿϷ�!");
		poketmonBag.remove(choice-1);
		System.out.println("3�� ���� ���ϸ��� �Է��ϼ���.");
		bag.showBag();
		choice=Integer.parseInt(Read.sc.nextLine());
		power+=poketmonBag.get(choice-1).power;
		System.out.println(poketmonBag.get(choice-1)+"���ÿϷ�!");
		poketmonBag.remove(choice-1);
		if(power>mewtwo.power) {
			System.out.println("�¸�!!!!!!!!!!!");
		}else {
			System.out.println("�й��Ͽ����ϴ�.");
		}
	}
	
}