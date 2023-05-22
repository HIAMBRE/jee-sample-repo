

//Sorting hashMap using keyset iterator



package com.collection.map;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class SortHashMap {
	public static void main(String args[]) {

		Map<Integer, String> hm = new HashMap<>();

		hm.put(2, "akshay");
		hm.put(1, "kumar");
		hm.put(35, "ajay");
		hm.put(9, "devgan");
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Before Sorting");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
		System.out.println("***********************");
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("After Sorting");
  
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		Iterator itr = tm.keySet().iterator();
		while (itr.hasNext()) {
			int key = (int) itr.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
	}
}
