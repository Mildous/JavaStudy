package step4;

public class PhoneBookVer04 {

	public static void main(String[] args) {
		PhoneBookManager pm = PhoneBookManager.getInstance();
		
		int choice = 0;
		
		while(true) {
			MenuViewer.showMenu();
			choice = Integer.parseInt(MenuViewer.sc.nextLine());
			
			switch(choice) {
			case 1:
				pm.inputData();
				break;
			case 2:
				pm.searchData();
				break;
			case 3:
				pm.updateData();
				break;
			case 4:
				pm.deleteData();
				break;
				
			case 6:
				pm.allDisplay();
				break;
			case 7:
<<<<<<< HEAD
				System.out.println("프로그램을 종료합니다");
=======
				System.out.println("���α׷� ����");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
				return;
			}
		}
	}
	
}
	
