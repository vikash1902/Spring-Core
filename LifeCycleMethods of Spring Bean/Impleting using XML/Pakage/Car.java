package lifecycle;

public class Car {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("from init method");
	}
	
	public void destroy() {
		System.out.println("from destroy method");
	}

}
