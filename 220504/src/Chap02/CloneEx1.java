package Chap02;

public class CloneEx1 {

	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point copy = (Point)(org.clone());

		System.out.println(org);
		System.out.println(copy);

		System.out.println(org.hashCode());
		System.out.println(copy.hashCode());

	}

}