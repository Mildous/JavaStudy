package Chap03;

public class CardTest {

	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);

		Card c1 = new Card(); //인스턴스화
		c1.kind = "heart";
		c1.num = 7;
		
		System.out.print(c1.kind);
		System.out.println(c1.num);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.num = 6;
		c2.width = 80;
		c2.height = 120;
		
		System.out.print(c2.kind);
		System.out.println(c2.num);
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		
	}

}
