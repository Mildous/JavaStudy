package Chap02;

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv(); //인스턴스화(=객체화)
		Tv t2 = new Tv();
		Tv[] tArr = new Tv[3];
		
		System.out.println(t1.color);
		
		t1.power = true;
		t1.channel = 10;
		t1.color = "red";
		
		t1.channelUp();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		System.out.println(t1);
		System.out.println(t2);
		
		t2.channel = 5;
		t2.channelDown();
		System.out.println(t2.channel);
	}

}
