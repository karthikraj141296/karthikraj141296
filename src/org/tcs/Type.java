package org.tcs;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Type {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "sql");
		m.put(40, "selenium");
		m.put(10, "python");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		String String = m.get(20);
		System.out.println(String);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(40);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("java");
		System.out.println(containsValue);
		
		m.remove(40);
		System.out.println(m);
		
		m.clear();
		System.out.println(m);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> x : entrySet) {
			
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
		
		
		
		
		
	}

}
