package Chap04;

import java.util.Scanner;

public class MyMathTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyMath mm = new MyMath();
		int a=0, b=0, c=0;
		
		System.out.print("???? 1 ==> ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("???? 2 ==> ");
		b = Integer.parseInt(sc.nextLine());
		
		System.out.println(mm.add(a, b));
		System.out.println(mm.add(a, b, c));
		System.out.println(mm.subtract(a, b));
		System.out.println(mm.multiply(a, b));
		System.out.println(mm.devide(a, b));
		mm.showNum(a, b);
		System.out.println(mm.add(30, 50, 60));
		
		
		
		/*
		int result = mm.add(200, 100);
		int result2 = mm.subtract(200, 100);
		int result3 = mm.multiply(200, 100);
		double result4 = mm.devide(200, 100);
		*/
	}

}
