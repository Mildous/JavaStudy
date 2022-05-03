package Chap06;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Piano());
		
		System.out.println("현재 잔액 : "+ b.money + "만원");
		System.out.println("현재 포인트 : "+ b.bonusPoint + "만원");
		
		b.summary();
	}

}
