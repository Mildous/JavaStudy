package Task0427_01_01;

public class SnackOrder {

	public static void main(String[] args) {
		Snack[] s = new Snack[3];
		
		s[0] = new Snack();
		s[1] = new Snack("�Ұ���", "����", 1500, 1);
		s[2] = new Snack("ġŲ", "��¡��", 1200, 1);
		
		for(int i=0; i<s.length; i++) {
			s[i].showSnackOrder();
		}

	}

}