package chap01;

public class BoxTest {

	public static void main(String[] args) {
		Box<Box> b1 = new Box<Box>();
		Box b2 = new Box();
		
		//b1.setItem("hello");
		//b1.setItem(35267);
		b1.setItem(b2);
		b2.setItem("1234");
		
		Box<Box> b3 = b1.getItem();
		//b3.setItem(b2.getItem());

	}

}
