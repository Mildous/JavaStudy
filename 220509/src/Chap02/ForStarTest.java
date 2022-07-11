package Chap02;

public class ForStarTest {

	public static void main(String[] args) {

		for(int j=0; j<5; j++) {
			
			for(int i=0; i<j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//¹Ý´ë·Î
		for(int j=5; j>0; j--) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
