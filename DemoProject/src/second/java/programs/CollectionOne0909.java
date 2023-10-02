package second.java.programs;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionOne0909 {
	
	HashSet<String> hashSet()
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Santosh");
		hs.add("kumar");
		
		return hs;
	}
	
public static void main(String[] args) {
			
		CollectionOne0909 co = new CollectionOne0909();
		
		System.out.println(co.hashSet());
		
		Iterator<String> itr = co.hashSet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		}
	}


