package Test;

public class TvTest {

	public static void main(String[] args) {
		
		Tv[] t = new Tv[3];
		
		for(int i=0; i<t.length; i++) {
			t[i] = new Tv();
			t[i].channel = i+5;	
		}
		for(int i=0; i<t.length; i++) {
			t[i].channelUp();
			System.out.printf("TV[%d] channel = %d%n", i, t[i].channel);
		}

	}

}
