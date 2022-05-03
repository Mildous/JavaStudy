package Chap04;

public class Exam02 {

	public static void main(String[] args) {
		
		int sum = 0;
		/*
		for(int i=1; i<=10; i++) {
			sum += i;	// sum = sum + i;
		} */
		for(int i=0; i<=10; i=i+2){
			sum += i;
		}
		System.out.println(sum);

	}

}
