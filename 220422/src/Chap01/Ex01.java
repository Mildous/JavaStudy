package Chap01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 숫자 10개 입력받아서 배열에 저장, 합을 출력.
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int sum=0;
		
		for(int i=0; i<input.length; i++) {
			System.out.print("숫자를 입력하세요. : ");
			input[i] = Integer.parseInt(sc.next());
		}
			for(int i=0; i<input.length; i++) {
				sum += input[i];
			}
			System.out.println(Arrays.toString(input));
			System.out.println(sum);
	}

}
