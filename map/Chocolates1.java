package com.xworkz.map.Hasmap;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Chocolates1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();//create a HashMap
		//name price
		map.put("Cadbury", 72);
		map.put("Combo", 100);
		map.put("Snickers", 10);
		map.put("Amul", 40);
		map.put("Combo", 12);
		map.put("KitKat", 10);
		map.put("Hershey", 70);
		map.put("Lindt", 10);
		map.put("Dairy milk", 10);
		map.put("Nestle", 5);
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("Combo"));
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
