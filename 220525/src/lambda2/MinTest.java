package lambda2;

public class MinTest {
	public static void main(String[] args) {
	MyMin m = (int a, int b) -> a > b ? b : a;
	System.out.println(m.min(10, -5));
	}
}
