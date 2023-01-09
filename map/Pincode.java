package com.xworkz.map.Hasmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Pincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();//create a HashMap
		map.put("Mudhol", 587313);
		map.put("Bagalkot", 587303);
		map.put("Badami",587302);
		map.put("Dharavad", 687313);
		map.put("Gadag", 787303);
		map.put("Belagavi",887302);
		map.put("Rachur", 187313);
		map.put("Vijayapur", 287303);
		map.put("Lokapur",387302);
		map.put("jamakhandi",487302);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("Badami"));
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
