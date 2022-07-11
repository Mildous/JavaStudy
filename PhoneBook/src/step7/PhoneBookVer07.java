package Step7;

public class PhoneBookVer07 {

	public static void main(String[] args) {
		PhoneBookManager pm = PhoneBookManager.getInstance();
		
		int choice = 0;
		
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = Integer.parseInt(MenuViewer.sc.nextLine());
				
				if(choice < MainMenu.INPUT || choice > MainMenu.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice) {
				case MainMenu.INPUT :
					pm.inputData();
					break;
				case MainMenu.SEARCH :
					pm.searchData();
					break;
				case MainMenu.UPDATE :
					pm.updateData();
					break;
				case MainMenu.DELETE :
					pm.deleteData();
					break;
				case MainMenu.DISPLAY : 
					pm.allDisplay();
					break;
				case MainMenu.ALLDELETE :
					pm.allDelete();
					break;
				case MainMenu.EXIT :
					System.out.println("���α׷� ����");
					return;
				}
				
			} catch (NumberFormatException e) {
				System.err.println("���ڸ� �Է��ϼ���.");
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("ó������ ���ư��ϴ�.");
			}
		}
	}
	
}
	
