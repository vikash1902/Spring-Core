package javaconfig;

public class Student {
	
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student(Book book) {
		super();
		this.book = book;
	}
	

	public void study() {
		this.book.read();
		System.out.println("this is very important topic to learn");
	}

}
