package training.java.first;

public class StringThirdWordReverse {
	
	static String str3 = "";
	String str1;
	
	public StringThirdWordReverse(String str1)
	{
		this.str1=str1;
	}
	
	 public boolean isEmptyString()
	{
		
		 if (str1.equals(""))
		 {
		 		 return false;
		 }
		 
		 return true;
		
	}
	 
	
	
	public void stringThirdWordReverse()
	{
		
		if(isEmptyString())
		{
		
		 int count=0;
		 
		String[] str1array = str1.split(" ");
		
		for(int i=(str1array.length)-1 ; i>=0;i--)
		{
			count = count+1;
			if (count == 3)
			{
				str3 = str1array[count+1] ;
				str1array[count+1] = str1array[count+2];
				str1array[count+2] = str3;
				for(int j=(str1array[i].length())-1;j>=0;j--)
				{
					System.out.print(str1array[i].charAt(j));
				}
				count=0;
				System.out.print(" ");
			}
			else {
				
			System.out.print(str1array[i]+" ");
			}
		}
		}
		else
		{
			System.out.println("String is Empty");
		}
		
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		//My name is Naveen and I work with Infosys
		//Infosys with krow and I neevaN is name yM
		
		 StringThirdWordReverse stwr = new StringThirdWordReverse("My name is Naveen and I work with Infosys");
		 StringThirdWordReverse stwr1 = new StringThirdWordReverse("");
		 stwr.stringThirdWordReverse();
		 stwr1.stringThirdWordReverse();

	}

}
