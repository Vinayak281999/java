package com.xworkz.map.Hasmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();//create a HashMap
		map.put("Mudhol",32);
		map.put("Bagalkot", 32);
		map.put("Badami",22);
		map.put("Dharavad", 23);
		map.put("Gadag", 43);
		map.put("Belagavi",22);
		map.put("Rachur", 33);
		map.put("Vijayapur", 23);
		map.put("Lokapur",32);
		map.put("jamakhandi",31);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("Mudhol"));
		System.out.println(map.values());
		System.out.println(map.keySet());
  
		System.out.println("----------key----------");
		Set<String> key =map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println("----------value----------");
		Collection<Integer> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("----------Eentry----------");
		Set<Entry<String, Integer>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));
		
	}

}
