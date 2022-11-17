package jaya.kumar.venkat;

import java.util.HashMap;
import java.util.Map;

public class TechParkChromepet {

	public static void main(String[] args) {

		Map<Integer,String> m = new HashMap<>();
		m.put(1, "jai");
		m.put(2, "kumar");
		m.put(3, "arun");
		m.put(4, "rajesh");
		m.put(5, "jai");
		System.out.println(m);
		Map<Integer,String> n= new HashMap<>();
		n.put(6, "suresh");
		n.putAll(m);
		System.out.println(n);
//		n.clear();
//		System.out.println(n);
		boolean a = n.isEmpty();
		System.out.println(a);
		
	}

}

