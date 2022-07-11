package Chap04;

public class Exam01 {

	public static void main(String[] args) {
		
		/* for(int i=1; i<=10; i++) {
			System.out.println(i); */
		/* for(int i=0; i<=10; i=i+2) {
			System.out.println(i); */
		/* for(int i=10; i>0; i--) {
			System.out.println(i); */
		/* for(int i=1; i<=10; i=i*3) {
			System.out.println(i); */
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("======");
		
		int j = 1;	//초기값
		while(j<=10) {
			System.out.println(j);
			j++; //증감식
		}
		System.out.println("======");
		
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k<=10);
	}

}
