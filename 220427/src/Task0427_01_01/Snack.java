package Task0427_01_01;

public class Snack {
	String shape;	//���
	String taste;	//��
	int price;	//�������
	int qty;	//�ֹ�����
	
	Snack(){
		this("����", "����", 0, 1);
	}
	
	Snack(String taste, String shape, int price, int qty){
		this.shape = shape;
		this.taste = taste;
		this.price = price;
		this.qty = qty;
	}
	
	Snack(String taste, String shape, int qty){
		this(taste, shape, 0, qty);
	}
	void showSnackOrder() {
		if(price != 0)
			System.out.println(shape+"���, "+taste+"��, �������: "+price+"��, "+qty+"��");
		else
			System.out.println(shape+"���, "+taste+"��, "+qty+"��");
		
	}
	

}
