package Chap03;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
		method();
		} catch(MyException e) {
			System.out.println(e.getErrcode());
			System.out.println(e.getMessage());
		}
	}

	static void method() throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 or 0 ===> ");
		int input = Integer.parseInt(sc.nextLine());
		if(input == 1)
			throw new MyException("���ǿ���");
		else
			System.out.println("�����߻�");
	}

}