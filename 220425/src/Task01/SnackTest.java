package Task01;

public class SnackTest {

	public static void main(String[] args) {
		Snack s1 = new Snack();
		s1.shape = "heart";
		s1.price = 1000;
		s1.taste = "����";
		
		Snack s2 = new Snack();
		s2.shape = "circle";
		s2.price = 1200;
		s2.taste = "����";
		
		System.out.printf("s1�� ũ��: %d * %d, ���: %s, %d��, %s��%n", s1.width, s1.height, s1.shape, s1.price, s1.taste);
		System.out.printf("s2�� ũ��: %d * %d, ���: %s, %d��, %s��%n", s2.width, s2.height, s2.shape, s2.price, s2.taste);
		
	}

}
