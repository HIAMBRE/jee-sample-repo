package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorMethods {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(10, "Orange");
		map.put(20, "Apple");
		map.put(30, "Grapes");
		System.out.println("*********Using Entry Set********");
		for(Entry<Integer, String>entry:map.entrySet())
		{
			System.out.println(entry);//.getKey()+" "+entry.getValue());
		}
		
		
		System.out.println("*********Using Key Set********");
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(10, "Orange");
		map1.put(20, "Apple");
		map1.put(30, "Grapes");
		
		Iterator<Integer> in = map1.keySet().iterator();
		for(Integer key:map1.keySet())
		{
			System.out.println(key);
		}
		
		
		System.out.println("*********Using values ********");
		Map<Integer,String> map2 = new HashMap<>();
		map2.put(10, "soham ");
		map2.put(20, "raju");
		map2.put(30, "meena");
		
		for(String value:map2.values())
		{
			System.out.println(value);//.getKey()+" "+entry.getValue());
		}
	}

	private static String[] value() {
		// TODO Auto-generated method stub
		return null;
	}
}
