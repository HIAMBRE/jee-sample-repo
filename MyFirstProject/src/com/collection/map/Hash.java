package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(10, "Orange");
		map.put(20, "Apple");
		map.put(30, "Grapes");
		System.out.println("*******Map Elements********");
		System.out.println(map.get(10));
		System.out.println(map.get(20));
		System.out.println(map.get(30));
		map.remove(20);
		System.out.println("******After Removing Apple*******");
		System.out.println(map);
		System.out.println("*******Size of Map********* ");
		System.out.println(map.size());
		map.put(101, "Banana");
		map.put(101, "Pinneapple");
		System.out.println(map);
		Map<Integer,String> map1 = new HashMap<>();
		map1.putAll(map);
		System.out.println("********Getting values of map object to map1 *****");
		System.out.println(map1);
		
	}

}
