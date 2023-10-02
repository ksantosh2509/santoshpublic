package training.java.first;

public class CountLettersAndPrint {
	
	

	public static void main(String[] args) {
		String str = "good", str2 = "";
		String[] str3 = str.split("");
		int count = 0,count1 = 0;

		for (int i = 0; i < str3.length; i++) {
			
			if (str2.contains(str3[i])) {
				
				str2 = str2 + str3[i];
				
				for (int j = 0; j < str2.length(); j++) {
					
					if (str2.charAt(j) == str.charAt(i)) {
						count1 = count1 + 1;
					}
				}

				System.out.print(str3[i] + count1);
				count1 = 0;
			}
			else {
				count = count + 1;
				System.out.print(str3[i] + count);
				str2 = str2 + str3[i];
			}
			count = 0;
		}
	}
}
