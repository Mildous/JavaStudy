package Test;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[3];
		
		for(int i=0; i<3; i++) {
			b[i] = new Book();
			System.out.print("å ���� ==> ");
			b[i].setTitle(sc.nextLine());
			System.out.print("���� ==> ");
			b[i].setWriter(sc.nextLine());
			System.out.print("���ǻ� ==> ");
			b[i].setCompany(sc.nextLine());
			System.out.print("���ǳ⵵ ==> ");
			b[i].setYear(Integer.parseInt(sc.nextLine()));
		}
		
		for(int i=0; i<b.length; i++)
			b[i].showBook();
		/*
		b[0] = new Book();
		b[0].setTitle("�ڹ��� ����");
		b[0].setWriter("���ü�");
		b[0].setCompany("��������");
		b[0].setYear(2016);
		
		b[0].showBook();
		*/
		
	}

}