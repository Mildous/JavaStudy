package Test;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[3];
		
		for(int i=0; i<3; i++) {
			b[i] = new Book();
			System.out.print("책 제목 ==> ");
			b[i].setTitle(sc.nextLine());
			System.out.print("저자 ==> ");
			b[i].setWriter(sc.nextLine());
			System.out.print("출판사 ==> ");
			b[i].setCompany(sc.nextLine());
			System.out.print("출판년도 ==> ");
			b[i].setYear(Integer.parseInt(sc.nextLine()));
		}
		
		for(int i=0; i<b.length; i++)
			b[i].showBook();
		/*
		b[0] = new Book();
		b[0].setTitle("자바의 정석");
		b[0].setWriter("남궁성");
		b[0].setCompany("도우출판");
		b[0].setYear(2016);
		
		b[0].showBook();
		*/
		
	}

}
