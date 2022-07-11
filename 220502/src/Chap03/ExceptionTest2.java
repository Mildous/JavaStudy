package Chap03;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			method();
		}catch(ArithmeticException e) {
			System.out.println("0");
		}
	}

	static void method() throws ArithmeticException{
		int number = 100;
		int result = 0;

		for(int i=0; i<10; i++) {

			result = number / (int)(Math.random()*10);
			System.out.println(result);
		}
	}

}