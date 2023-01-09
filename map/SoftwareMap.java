package com.xworkz.map.Hasmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SoftwareMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<>();//create a HashMap
		map.put("HCL", "Software comapny");
		map.put("Infosys", "Software comapny");
		map.put("Hero","Mechanical comapny");
		map.put("Labcorp", "Software comapny");
		map.put("Wipro", "Software comapny");
		map.put("Tata","Mechanical comapny");
		map.put("Cognizant", "Software comapny");
		map.put("LT", "Software comapny");
		map.put("TCS","Software comapny");
		map.put("Amazon","Software comapny");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("Infosys"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		System.out.println("----------key----------");
		Set<String> key =map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println("----------value----------");
		Collection<String> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("----------Eentry----------");
		Set<Entry<String, String>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));

	}

}
