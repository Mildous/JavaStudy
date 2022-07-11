package lambda2;

public class AdderTest {

	public static void main(String[] args) {
		MyAdder f = (int a, int b)-> a+b;
		MyAdder f2 = (int a, int b)-> (a+b)*2;
		System.out.println(f.add(10, 20));
		System.out.println(f2.add(10, 20));
	}

}
