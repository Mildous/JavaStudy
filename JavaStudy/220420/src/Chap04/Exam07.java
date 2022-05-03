package Chap04;

public class Exam07 {

	public static void main(String[] args) {
		//2 X 1 = 2
		//2 X 2 = 4
		/*
		* for(int i=1; i<10; i++) {
			System.out.printf("2 X %d = %d%n", i, 2*i);
			} */
		/*
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
			System.out.printf("%d X %d = %d%n", i, j, i*j);
			
			}
			System.out.println("============");
		}*/
		/*
		int i=2;
		while(i<10) {
			int j=1;
			while(j<10) {
			System.out.printf("%d X %d = %d%n", i, j, i*j);
			j++;
			}
			i++;
			System.out.println("============");
		} */
		/*
		int j=1;
		int i=2;
			do {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
				i++;
				j++;
				}while(j<10);
		*/
		int i=2;
		do { 
			int j=1;
				do {
					System.out.printf("%d X %d = %d%n", i, j, i*j);
					j++;
					}while(j<10);
					i++;
					System.out.println("============");
		}while(i<10);
	}
}


