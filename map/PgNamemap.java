package com.xworkz.map.Hasmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PgNamemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> map=new HashMap<>();//create a HashMap
		map.put("BhavaniPG", 5000);
		map.put("RajPG", 6000);
		map.put("Brami",6000);
		map.put("MarutiPG", 5000);
		map.put("PavanPg", 6000);
		map.put("RaviPG",6000);
		map.put("RajPG", 5000);
		map.put("RavPG", 6000);
		map.put("HanamanPG",6000);
		map.put("RamPG", 5000);
		
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("Brami"));
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
