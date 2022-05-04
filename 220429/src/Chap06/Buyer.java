package Chap06;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int curCnt = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 구입불가");
			return;	
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item[curCnt] = p;
		curCnt++;
		//System.out.println(p+"을/를 구입했습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}

}
