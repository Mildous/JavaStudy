package Chap02;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] bArr = new Book[3];
		
		for(int i=0; i<3; i++) {
			bArr[i] = new Book();
			System.out.print("å���� ==> ");
			bArr[i].setTitle(sc.nextLine());
			System.out.print("���� ==> ");
			bArr[i].setWriter(sc.nextLine());
			System.out.print("���ǻ� ==> ");
			bArr[i].setCompany(sc.nextLine());
			System.out.print("���ǳ⵵ ==> ");
			bArr[i].setYear(Integer.parseInt(sc.nextLine()));
		}	
		
		/*
		bArr[0] = new Book();
		bArr[0].setTitle("�ڹ�������");
		bArr[0].setWriter("���ü�");
		bArr[0].setCompany("�������ǻ�");
		bArr[0].setYear(2016);
		
		bArr[1] = new Book();
		bArr[1].setTitle("�ڹ�������");
		bArr[1].setWriter("���ü�");
		bArr[1].setCompany("�������ǻ�");
		bArr[1].setYear(2016);
		
		bArr[2] = new Book();
		bArr[2].setTitle("�ڹ�������");
		bArr[2].setWriter("���ü�");
		bArr[2].setCompany("�������ǻ�");
		bArr[2].setYear(2016);
		*/
		for(int i=0;i<bArr.length; i++)
			bArr[i].showBook();
		
	}

}
