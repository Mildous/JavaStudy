package step8;

public class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int choice) {
		super("�߸��� �����Դϴ�.");
		wrongChoice = choice;
	}
	
	public void showWrongChoice() {
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}
