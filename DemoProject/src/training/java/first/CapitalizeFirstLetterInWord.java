package training.java.first;

public class CapitalizeFirstLetterInWord {

	public static void main(String[] args) {
		 String str1 = "this is javatpoint";
	       
	       String[] str2 = str1.split("");

	       
	       for(int i =0;i<str2.length;i++)
	       {
	    	   if(i==0)
	    	   {
	    		   System.out.print(str2[i].toUpperCase());
	    	   }
	    	   
	    	   else if (str2[i].equals(" "))
	          {
	        	  System.out.print(str2[i]+str2[i+1].toUpperCase());
	        	  i++;
	          }
	          else
	          {
	        	  System.out.print(str2[i]);
	          }
	       }
	      

	}

}
