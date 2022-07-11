package exam01;

public class Ex06 {

	public static void main(String[] args) {
//		반복문 : for, while, do ~ while
//		continue, break
//		for(초기값; 종료값; 증가) { }
//		while(조건) { }
//		구구단 : 3단
		
		int front = 3;
		for(int i=1; i<=9; i++) {
			System.out.println(front + " x " + i + " = " + front * i);
			//System.out.printf("%d x %d = %d%n", front, i, front*i);
		}
		
		for(int i=2; i<=9; i++) {
			System.out.println("------------");
			System.out.println(" < " + i + "단 > ");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			
		}
		int i = 2;
		int j = 1;
		while(i <= 9) {
			System.out.println("------------");
			System.out.println(" < " + i + "단 > ");
			while(j <= 9) {
				System.out.printf("%d x %d = %d%n", i, j, i*j);	
				j++;
			}
			i++;
		}
	}

}
