package Chap01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// ���� 10�� �Է¹޾Ƽ� �迭�� ����, ���� ���.
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int sum=0;
		
		for(int i=0; i<input.length; i++) {
			System.out.print("���ڸ� �Է��ϼ���. : ");
			input[i] = Integer.parseInt(sc.next());
		}
			for(int i=0; i<input.length; i++) {
				sum += input[i];
			}
			System.out.println(Arrays.toString(input));
			System.out.println(sum);
	}

}