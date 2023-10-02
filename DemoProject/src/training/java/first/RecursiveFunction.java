package training.java.first;

public class RecursiveFunction {
	
	static int i =1;
	public static void recursiveFunction()
	{
		if (i <= 100)
		{
			System.out.println(i);
			i++;
		recursiveFunction();
		}
	}

	public static void main(String[] args) {
		recursiveFunction();

	}

}
