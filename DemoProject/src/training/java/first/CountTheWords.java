package training.java.first;

public class CountTheWords {
	//str=Java is java again java
	public void inputWord(String str)
	{
		int count=0;
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
			count++;
		}
		System.out.println("Total Number of words "+count);
	}

	public static void main(String[] args) {
		CountTheWords ctw = new CountTheWords();
		ctw.inputWord("Java is java again java");

	}

}
