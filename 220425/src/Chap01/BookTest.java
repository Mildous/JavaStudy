package Chap01;

public class BookTest {

	public static void main(String[] args) {
	
		Book[] Book = new Book[3];
		
		Book b = new Book();
		/*
		b.setTitle("�ڹ��� ����");
		b.setWriter("���ü�");
		b.setPublisher("��������");
		b.setYear("2016-01-27");
		*/
		System.out.println(b.getTitle());
		System.out.println(b.getWriter());
		System.out.println(b.getPublisher());
		System.out.println(b.getYear());
		
		b.showBook();
		

	}

}