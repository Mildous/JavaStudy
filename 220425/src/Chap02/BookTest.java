package Chap02;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] bArr = new Book[3];
		
		for(int i=0; i<3; i++) {
			bArr[i] = new Book();
			System.out.print("책제목 ==> ");
			bArr[i].setTitle(sc.nextLine());
			System.out.print("저자 ==> ");
			bArr[i].setWriter(sc.nextLine());
			System.out.print("출판사 ==> ");
			bArr[i].setCompany(sc.nextLine());
			System.out.print("출판년도 ==> ");
			bArr[i].setYear(Integer.parseInt(sc.nextLine()));
		}	
		
		/*
		bArr[0] = new Book();
		bArr[0].setTitle("자바의정석");
		bArr[0].setWriter("남궁성");
		bArr[0].setCompany("도우출판사");
		bArr[0].setYear(2016);
		
		bArr[1] = new Book();
		bArr[1].setTitle("자바의정석");
		bArr[1].setWriter("남궁성");
		bArr[1].setCompany("도우출판사");
		bArr[1].setYear(2016);
		
		bArr[2] = new Book();
		bArr[2].setTitle("자바의정석");
		bArr[2].setWriter("남궁성");
		bArr[2].setCompany("도우출판사");
		bArr[2].setYear(2016);
		*/
		for(int i=0;i<bArr.length; i++)
			bArr[i].showBook();
		
	}

}

