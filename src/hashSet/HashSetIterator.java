package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());

			
		}
		
		
		
	}

}
