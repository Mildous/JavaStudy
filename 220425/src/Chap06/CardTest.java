package Chap06;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("heart", 5);
		//c1.kind = "heart";
		//c1.num = 7;
		Card c2 = new Card();
		Card c3 = new Card("spade", 9);
		
		System.out.println(c1.kind);
		System.out.println(c1.num);
		

	}

}
