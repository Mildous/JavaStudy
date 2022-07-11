package Chap03;

public class MethodTest {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		initArr(arr);
		printArr(arr);
		
		System.out.println("Hello");
		
		initArr(arr);
		printArr(arr);
	}
	
	static void initArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
