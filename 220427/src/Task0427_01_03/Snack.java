package Task0427_01_03;

public class Snack {
	String shape;	//���
	String taste;	//��
	String price;	//�������
	int qty;	//�ֹ�����
	
	Snack(){
		this("����", "����", null, 1);
	}
	
	Snack(String taste, String shape, String price, int qty){
		this.shape = shape;
		this.taste = taste;
		this.price = price;
		this.qty = qty;
	}
	
	Snack(String taste, String shape, int qty){
		this(taste, shape, null, qty);
	}
	void showSnackOrder() {
		if(price != null && price.length()!=0)
			System.out.println(shape+"���, "+taste+"��, �������: "+price+"��, "+qty+"��");
		else
			System.out.println(shape+"���, "+taste+"��, "+qty+"��");
		
	}
	

}
