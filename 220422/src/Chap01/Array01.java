package Chap01;

public class Array01 {

	public static void main(String[] args) {
		int a1 = 1, a2 = 2, a3 = 3;
		int sum=0;
		
		int[] a = new int[10];
		double[] b = new double[5];
		boolean[] bo = new boolean[5];
		char[] c = {'a', 'b', 'c'}; // 값 바로 세팅
		
		int[] score;
		score = new int[5];
		
		
		for(int i=0; i<a.length; i++)
			a[i] = i*10;
		
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
			
			System.out.println(a.length);
			System.out.println(a);
	}

}
