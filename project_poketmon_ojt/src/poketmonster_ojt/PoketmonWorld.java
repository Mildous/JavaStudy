package poketmonster_ojt;

public class PoketmonWorld {

	public static void main(String[] args) {
	PoketmonManager bag= PoketmonManager.getPoketMonBag();
	int choice = 0;
	Poketmon tmp = null;
		
	while(true) {
		Menu.showMenu();
		choice=Integer.parseInt(Menu.sc.nextLine());
		switch(choice) {
		case Menu.CATCH:
			tmp=bag.catchPoketmon();
			if(tmp!=null) {
				bag.poketmonBag.add(tmp);
				}
				break;
			case Menu.BAG:
				bag.showBag();
				break;
			case Menu.DELETE:
				bag.deletePoketMon();
				break;
			case Menu.FIGHT:
				bag.fight();
				break;
			case Menu.EXIT:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
	}
}