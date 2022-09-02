package hashSet;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("USA"));
		System.out.println(hs.size());
		System.out.println(hs.removeAll(hs));
		System.out.println(hs.size());
		System.out.println(hs);
		
		
		
		

	}

}
