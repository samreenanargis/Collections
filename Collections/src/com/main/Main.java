package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.learn.list.listUtilities;
import com.learn.set.SetUtilities;

public class Main {

	public static void main(String[] args) {
		
		SetUtilities setUtil1 = new SetUtilities();
			
		//testHashSet(setUtil1);
		//testLinkedHashSet(setUtil1);
		//testTreeSet(setUtil1);	
		testArrayList();
	}
	
	
	/**
	 * 
	 * @param setUtils
	 */
	public static void testLinkedHashSet(SetUtilities setUtils) {	
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		
		setUtils.printSet(linkedHashSet);
	}
	
	
	/**
	 * 
	 * @param setUtil
	 */
	public static void testHashSet(SetUtilities setUtil) {
		
		/* Create an instance of Hash set for Hash set example.*/
		Set<String> test = new HashSet<String>();
		
		/* Adding values into Hash set, making sure i add a duplicate value to see if it gets added. */
		test.add("Samreena");
		test.add("Praveen");
		test.add("Samreena");
		test.add("Naveen");
		test.add("Soody");
		test.add("Hasthra");
		
		setUtil.printSet(test);
	}
	
	
	/**
	 * This method creates a variable of type TreeSet.
	 * Next it adds values to the variable.
	 * Finally it calls upon the printSet() method that prints the values added to the variable. 
	 * @param setUtil
	 */
	public static void testTreeSet(SetUtilities setUtil) {
		
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Apple");
		treeSet.add("Dog");
		treeSet.add("Cat");
		treeSet.add("Ball");
		
		setUtil.printSet(treeSet);
	}
	
	public static void testArrayList() {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
		arrayList.add("five");
		
		listUtilities listUtils = new listUtilities();
		listUtils.printList(arrayList);
		
	}

}
