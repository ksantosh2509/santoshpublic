package training.java.first;

public class Constructors {

	int a, b, result;

	public Constructors(int a, int b) {
		//super();
		this();
		this.a = a;
		this.b = b;
		System.out.println("First"+" "+ (this.a + this.b));
	}

	public Constructors() {
		System.out.println("Second"+" "+(this.a + this.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructors(10, 300);

	}

}
