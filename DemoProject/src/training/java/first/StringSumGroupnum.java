package training.java.first;

/*public class StringSum {

	public static void main(String[] args) {
		// Selenium45Testing67

		String str = "Selenium45Testing67!!@@##";
		String temp = "0";
		int sum=0;
		

		for (int i = 0; i < str.length();i=i+1 ) {

			if ((48 < str.charAt(i)) && (str.charAt(i) < 58)) {
				System.out.println(str.charAt(i));
				temp = temp+str.charAt(i);
				
			}
			else
			{
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(sum);

	}

}*/

class StringSumGroupnum {
    public static void main(String[] args) {
        //String str1 = "abcd47gh65";
        String str1 = "Selenium45Testing67!!@@#";
        String str2="0";
        int j =0 ;
        
        for(int i=0;i<str1.length();i=i+1)
        {
            if ((str1.charAt(i) > 48) && (str1.charAt(i) < 58))
            {
                str2 = str2+str1.charAt(i);
            }
            else
            {
                j = j + Integer.parseInt(str2);
                str2= "0";
            }
            
            if (str1.charAt(i) == str1.charAt(str1.length()-1))
            	
            {
            	 j = j + Integer.parseInt(str2);
            }
        }
        System.out.println(j);
        System.out.println(str2);
    }
}
