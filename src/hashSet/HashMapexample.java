package hashSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(0, "hello");
		hs.put(1, "goodbye");
		hs.put(2, "goodmorning");
		hs.put(3, "goodevening");
		hs.put(4, "goodafternoon");
		System.out.println(hs.get(2));
		System.out.println(hs.get(21));
		
		Set sn = hs.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());

		}
		
		

		
		
		

	}

}
