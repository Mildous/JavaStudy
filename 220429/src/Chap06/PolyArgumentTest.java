package Chap06;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Piano());
		
		System.out.println("���� �ܾ� : "+ b.money + "����");
		System.out.println("���� ����Ʈ : "+ b.bonusPoint + "����");
		
		b.summary();
	}

}