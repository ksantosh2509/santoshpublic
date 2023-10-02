package training.java.first;

public class StringToInt {
	
	public void stringToInt(String str)
	{
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInt sti = new StringToInt();
		sti.stringToInt("123");
	}

}
