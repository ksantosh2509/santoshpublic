package second.java.programs;

import java.util.HashMap;
import java.util.Map;

public class CollectionTwo1109 {
	
	
	HashMap<Integer, String> hashMap()
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Santosh");
		hm.put(2,"Kumar");
		
		return hm;
	}

	public static void main(String[] args) {
		
		CollectionTwo1109 ct = new CollectionTwo1109();
		for(Map.Entry<Integer, String> entry: ct.hashMap().entrySet())
		{
			System.out.println("Key    : "+entry.getKey()+"\n"+"Value:    "+entry.getValue());
		}
		
	}

}
