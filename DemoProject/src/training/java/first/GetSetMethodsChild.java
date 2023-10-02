package training.java.first;

public class GetSetMethodsChild extends GetSetMethods {
	
	

	public GetSetMethodsChild(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		GetSetMethodsChild gsmc = new GetSetMethodsChild(32, 21);
		gsmc.method_1();
		GetSetMethods gsm1 = new GetSetMethods(45, 43);
		gsm1.method_1();
		GetSetMethods gsmc1 = new GetSetMethodsChild(21, 22);
		gsmc1.method_1();
		
		
		gsmc.seta(10);
		System.out.println(gsmc.geta());
		gsmc.setb(20);
		gsmc.method_1();
		gsmc.seta(100);
		gsmc.setb(200);
		gsmc.method_1();
		gsmc1.seta(1000);
		gsmc1.setb(2000);
		gsmc1.method_1();
		
		
	}

}
