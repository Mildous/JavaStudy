package Chap04;

public class MyMath {
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	double devide(double a, int b) {
		return a / b;
	}

	String showNum(int a, int b) {
		return "입력한 수는 " +a+ ", " +b+ " 입니다.";
	}
}
