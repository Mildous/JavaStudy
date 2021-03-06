package Task0427_01_03;

public class SnackOrderManager {
	
	final int MAX_CNT=100;
	Snack[] orderStorage = new Snack[MAX_CNT];
	int curCnt = 0;
	
	//1. 입력
	void inputOrder() {
		
		System.out.print("모양 : ");
		String shape = MenuViewer.sc.nextLine();
		System.out.print("맛 : ");
		String taste = MenuViewer.sc.nextLine();
		System.out.print("희망가격 : ");
		String price = (MenuViewer.sc.nextLine());
		System.out.print("주문수량 : ");
		int qty = Integer.parseInt(MenuViewer.sc.nextLine());
		
		orderStorage[curCnt++] = new Snack(shape, taste, price, qty);
		System.out.println("--> 주문완료");
		System.out.println();
	}
	
	//2.검색
	void searchOrder() {
		System.out.print("주문하신 모양을 입력하세요. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
			
			if(index > -1) { //검색 성공시 입력한 주문내역 출력
				orderStorage[index].showSnackOrder();
			}else { //검색 실패시
				System.out.println("해당 주문건은 존재하지 않습니다.");
				System.out.println();
			}
		
	}
	
	private int search(String shape) {
		
		for(int i=0; i<curCnt; i++) {
			if(shape.equals(orderStorage[i].shape)) {//i의 객체 주소를 index에 전달
				return i;
			}
		}
		return -1;
	}
	
	//3.수정
	void updateOrder() {
		System.out.print("수정하실 주문건의 모양을 입력하세요. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
		
		if(index > -1) { // 검색 성공시 수정할 주문 입력
			System.out.print("맛: ");
			String taste = MenuViewer.sc.nextLine();
			System.out.print("희망가격: ");
			String price = MenuViewer.sc.nextLine();
			System.out.print("수량: ");
			int qty = MenuViewer.sc.nextInt();
			
			orderStorage[index].price = MenuViewer.sc.nextLine();
			System.out.println("해당 주문건이 정상적으로 수정되었습니다.");
			System.out.println();
		}else {//검색 실패시
			System.out.println("해당 주문건은 존재하지 않습니다.");
			System.out.println();
		}
			
	}
	
	//4.삭제
	void deleteOrder() {
		
		System.out.print("삭제하실 주문건의 모양을 입력하세요. --> ");
		String shape = MenuViewer.sc.nextLine();
		
		int index = -1;
		index = search(shape);
		
		if(index > -1) { // 검색 성공시 삭제
			
			for(int i=index; i<curCnt; i++) {
				orderStorage[i] = orderStorage[i+1];
			}
			curCnt--;
			System.out.println("해당 주문건을 정상적으로 삭제하였습니다.");
			System.out.println();
			
		}else {//검색 실패시
			System.out.println("해당 주문건은 존재하지 않습니다.");
			System.out.println();
		}
		
	}
	
	//5.전체출력
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			orderStorage[i].showSnackOrder();
			System.out.println();
		}
	}
	
	
}

