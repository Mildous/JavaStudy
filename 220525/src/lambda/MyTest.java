package lambda;

public class MyTest {

	public static void main(String[] args) {
		MyFunction mc = new MaxClass();
		MyFunction mc2 = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		MyFunction mc3 = (int a, int b) -> { return a > b ? a : b; };
		
		System.out.println(mc.max(5, 3));
		System.out.println(mc2.max(5, 30));
		System.out.println(mc3.max(55, 30));
	}

}
