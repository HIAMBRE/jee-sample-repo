package com.collection.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<MapSample>> map = new HashMap<>();
		MapSample sam1= new MapSample(1,"hina");
		MapSample sam2= new MapSample(2,"rohit");
		MapSample sam3= new MapSample(6,"shubham");
		MapSample sam4= new MapSample(7,"nikhil");
		
		List<MapSample> list1= new ArrayList<>();
		list1.add(sam4);
		list1.add(sam3);
		
		List<MapSample> list2 = new ArrayList<>();
		list2.add(sam1);
		list2.add(sam2);
		
		map.put("Finanace",list1);
		map.put("HR",list2);
		
		List<MapSample> l= map.get(list1);
		System.out.println(l.size());	
	}
}
