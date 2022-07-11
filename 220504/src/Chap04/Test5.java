package Chap04;

public class Test5 {
	
	public static void main(String[] args) {
		int i = 100;
		//Integer it = new Integer(100);
		method(i);
		
		int j = new Integer(200); 	//¾ð¹Ú½Ì
		System.out.println(j);
		
	}
	
	static Object method(Object obj) {
		return obj;
	}
}
