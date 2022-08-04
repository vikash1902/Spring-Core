package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {
     
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("working as init method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("working as destroy method");
	}
}
