package training.java.first;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] AnIntArray = {1,2,3,4};
		System.out.println(AnIntArray.length);
		System.out.println(AnIntArray[0]);
		String[] StringArray = new String[4];
		
		StringArray[0] = "Santosh";
		for(int i=0;i<StringArray.length;i++)
		{
			StringArray[i] = "Kumar"+i;
			System.out.println(StringArray[i]);
		}
		
	}

}
