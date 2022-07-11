package javatest;

public class Ex05 {

	public static void main(String[] args) {
//		연산자 : 대입, 산술, 비교, 논리(and, or, not)
		int num1 = 10;
		int num2 = 20;
		
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		
		double num6 = num1 / (double)num2;
		
		int num7 = num1 % num2;
		
		int value1 = 23;
		String msg = "홀수";
		if(value1 % 2 == 0) {
			msg = "짝수";
		}
		System.out.println(value1 + " : " + msg);
		
		//증감연산자
		int a = 5;
		a = a + 1;
		a++;
		++a;
		
		int m = 10;
		m = m - 1;
		m--; 
		--m;
		
		int s = 5;
		int t = 3;
		System.out.println(s > t);	//참, 거짓
		
	}
}
