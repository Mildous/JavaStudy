package Task0427_01_03;

public class SnackOrderVer2 {

	public static void main(String[] args) {
		SnackOrderManager pm = new SnackOrderManager();
		
		int choice = 0;
		
		while(true) {
			MenuViewer.showMenu();
			choice = Integer.parseInt(MenuViewer.sc.nextLine());
			
			switch(choice) {
			case 1:
				pm.inputOrder();
				break;
			case 2:
				pm.searchOrder();
				break;
			case 3:
				pm.updateOrder();
				break;
			case 4:
				pm.deleteOrder();
				break;
			case 5:
				pm.allDisplay();
				break;
			case 6:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			}
		}
		
	}
}