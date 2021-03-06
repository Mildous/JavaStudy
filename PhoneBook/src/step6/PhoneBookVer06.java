<<<<<<< HEAD
package Step6;
=======
package step6;
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba

public class PhoneBookVer06 {

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
				case MainMenu.EXIT :
					System.out.println("프로그램 종료");
					return;
				}
				
			} catch (NumberFormatException e) {
				System.err.println("숫자만 입력하세요.");
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("처음으로 돌아갑니다.");
			}
		}
	}
	
}
	
