package Chap01;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex6_5 {

	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� "+c1.kind+", "+c1.height+"�̸�, ũ��� ("+c1.width+", "+c1.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.height+"�̸�, ũ��� ("+c2.width+", "+c2.height+")");
		
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1�� "+c1.kind+", "+c1.height+"�̸�, ũ��� ("+c1.width+", "+c1.height+")");
		System.out.println("c2�� "+c2.kind+", "+c2.height+"�̸�, ũ��� ("+c2.width+", "+c2.height+")");

	}

}