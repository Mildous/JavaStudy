package Chap02;

import java.util.Arrays;

public class CloneEx3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arrClone = new int[arr.length];
		System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));

	}

}
