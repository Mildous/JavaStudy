package Chap02;

public class StringExam {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str4);

	}

}
