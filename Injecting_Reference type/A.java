package ref;

public class A {

	private int x;
	private B ob;

	public void setX(int x) {
		System.out.println("hello");
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
