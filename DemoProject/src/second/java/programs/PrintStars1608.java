package second.java.programs;

public class PrintStars1608 {
	
	void printStars(int rows)
	{
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		PrintStars1608 ps = new PrintStars1608();
		ps.printStars(5);
	}
}
