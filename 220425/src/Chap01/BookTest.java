package Chap01;

public class BookTest {

	public static void main(String[] args) {
	
		Book[] Book = new Book[3];
		
		Book b = new Book();
		/*
		b.setTitle("자바의 정석");
		b.setWriter("남궁성");
		b.setPublisher("도우출판");
		b.setYear("2016-01-27");
		*/
		System.out.println(b.getTitle());
		System.out.println(b.getWriter());
		System.out.println(b.getPublisher());
		System.out.println(b.getYear());
		
		b.showBook();
		

	}

}
