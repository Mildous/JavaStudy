package Array;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
			
		System.out.println("������ : " + arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("arr : "+arr);
		
		int[] tmp = new int[arr.length*2];
		System.out.println("tmp : "+tmp);
		
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		System.out.println("������ : "+arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("arr : "+arr);
		}
		
	}

