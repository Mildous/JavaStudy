package Array;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 2, arr2, 5, 2);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		

	}

}
