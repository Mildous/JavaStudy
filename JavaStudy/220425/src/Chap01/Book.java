package Chap01;
//제목, 저자, 출판사, 년도
//책3권의 정보 출력
public class Book {
	
	private String title;
	private String writer;
	private String publisher;
	private String year;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public void showBook() {
		System.out.printf("%s,%s,%s,%s", title, writer, publisher, year);
	}
	
	

	

}
