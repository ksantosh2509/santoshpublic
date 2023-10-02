package training.java.first;

public class CapAndSmallLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DAo_.zX@gVxt";
		int i;
		int count=0,count_1=0;
		for (i = 0  ; i < str.length() ; i++ )
		{
			if ('a' <= str.charAt(i) &&  str.charAt(i) <= 'z')
			{
				System.out.println("Small Letters"+" "+str.charAt(i));
				count = count+1;
			}
			else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
			{
				System.out.println("Capital Letters"+" "+str.charAt(i));
				count_1 = count_1+1;
			}
			else
			{
				
			}
			
		}
		
		System.out.println("Small Letters Count:"+count+"Capital Letter Count:"+count_1);
		
	}

}
