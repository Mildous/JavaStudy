package Chap04;

public class Exam04 {
	public static void main(String[] args) {
		int sum = 0;
		/*
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("1���� %2d������ �� : %2d%n", i, sum); */
		/*
		int i=1;
		while(i<=10) {
			sum += i;
			System.out.printf("1���� %2d������ �� : %2d%n", i, sum);
			i++; */
		
		int i=1;

		do {
			sum += i;
			System.out.printf("1���� %2d������ �� : %2d%n", i, sum);
			i++;
		} while(i<=10);
	}
}


