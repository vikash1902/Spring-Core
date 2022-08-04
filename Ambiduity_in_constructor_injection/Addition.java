package ci;

public class Addition {

	
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double , double" );
	}
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int , int" );
	}

	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String , String" );
	}

	
	public void doSum() {
		System.out.println("the value of a is: " + this.a);
		System.out.println("the value of b is: " + this.b);
		System.out.println("the sum is : " + (this.a + this.b));
	}
}
