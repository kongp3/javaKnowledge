package com.cto.edu.collection;

import java.util.Iterator;
import java.util.TreeSet;

// 有序的
public class TreeSetTest {
	
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String> ();
		tree.add("China");
		tree.add("America");
		tree.add("Japan");
		tree.add("Chinese");
		tree.add("Diio");
		Iterator<String> iter = tree.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}