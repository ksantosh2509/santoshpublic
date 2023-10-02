package training.java.first;

public class ExampleStatic {

	 static int i = 10;

	public void e1() {
		int i = 20;
		System.out.println(i);
		System.out.println(ExampleStatic.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From Main"+i);
		ExampleStatic obj = new ExampleStatic();
		obj.e1();
		
	}

}
