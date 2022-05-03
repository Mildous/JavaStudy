package Chap04;

public class Exam05 {

	public static void main(String[] args) {
		/*
		for(int i=1, j=10; i<=10; i++,j--) {
			System.out.printf("%d \t %d%n",i,j);
		}*/
		/*
		int i=1, j=10;
		while(i<=10) {
			System.out.printf("%d \t %d%n",i,j);
			i++; 
			j--;
		}*/
		int i=1, j=10;
		do {
			System.out.printf("%d \t %d%n",i,j);
			i++;
			j--;
		}while(i<=10);
	}

}
