package training.java.first;

public class GetSetMethods {
	
	private  int a;
	private int b;
	
	public GetSetMethods(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	
	public void method_1 ()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public int geta()
	{
		return a;
		
	}
	
	public int getb()
	{
		return b;
		
	}
	
	public void seta(int a)
	{
		this.a = a;
	}
	public void setb(int b)
	{
		this.b = b;
	}

	public static void main(String[] args) {
		GetSetMethods gsm = new GetSetMethods(23, 43);
		gsm.method_1();
		
	}

}
