package Chap01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date(); // java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString()); // �������̵� �Ǿ� ����
		System.out.println(today);
		System.out.println(today.toString());

	}

}
