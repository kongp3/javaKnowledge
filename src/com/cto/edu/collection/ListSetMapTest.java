package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * List和Set,map有什么区别 
 */
public class ListSetMapTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add(null);
		list.add(null);
		System.out.println("list:" + list);
		
	    Set<String> set = new HashSet<String>();
	    set.add("A");
	    set.add("B");
	    set.add("C");
	    set.add("D");
	    set.add("D");
	    set.add(null);
	    set.add(null);
	    System.out.println("set:" + set);
	    
	    Map<String, String> map  = new  HashMap<String,String>();
	    map.put("A", "A");
	    map.put("B", "B");
	    map.put("C", "C");
	    map.put("D", "D");
	    map.put(null, null);
	    map.put(null, null);
	    map.put("E", null);
	    System.out.println("map:" + map);
	    
	}
}
