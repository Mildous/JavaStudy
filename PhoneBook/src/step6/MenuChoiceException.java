<<<<<<< HEAD
package Step6;
=======
package step6;
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("�߸��� ������ �̷������ϴ�.");
		wrongChoice = choice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}
