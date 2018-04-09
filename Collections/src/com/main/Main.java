package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.learn.list.listUtilities;
import com.learn.set.SetUtilities;

public class Main {

	public static void main(String[] args) {
		
		SetUtilities setUtil1 = new SetUtilities();
		String chinese[] = {"Noodles", "Manchuria", "Hot & Sour"};
		String mughlai[] = {"Biryani", "Nihari", "Khichdi"};
		
		List<String> assorted = new ArrayList<String>(Arrays.asList(chinese));
		assorted.addAll(Arrays.asList(mughlai));
		
		//testHashSet(setUtil1);
		//testLinkedHashSet(setUtil1);
		//testTreeSet(setUtil1);	
		//testArrayList();
		removeFromLinkedList(assorted, mughlai);
	}
	
	
	/**
	 * This method declares an ArrayList of String type. 
	 * It then adds values to the ArrayList.
	 * Next it creates an instance of class listUtilities and calls the printList() method which prints 
	 * the arrayList.
	 */
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
	
	
	
	/**
	 * This method accepts a List and a String array for arguments. 
	 * First the method converts the String array to a List. 
	 * Then it creates a variable of type Iterator and assigns the list to it. 
	 * @param list
	 * @param array2
	 */
	public static void removeFromLinkedList(List list, String[] array2) {
		//List<String> linkedList1 = new LinkedList<String>();
		List<String> linkedList2 = new LinkedList<String>();
		
		//linkedList1.addAll(Arrays.asList(array1));
		linkedList2.addAll(Arrays.asList(array2));
		Iterator<String> linkedList1Iterator = list.iterator();
		
		System.out.println("Assorted: " +list);
		System.out.println("Items to be removed: " +linkedList2);
		
		while (linkedList1Iterator.hasNext()) {
			if(linkedList2.contains(linkedList1Iterator.next())) {
				linkedList1Iterator.remove();
			}
			
		}
		System.out.println("Items remaining: "+list);
	}
	
	
	
	/**
	 * 
	 * @param setUtil
	 */
	public static void testHashSet(SetUtilities setUtil) {
		
		/* Declare a HashSet for HashSet example.*/
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
	 * This method creates a variable of type linkedHashSet.
	 * It also creates an array 'addAtOnce'
	 * Then using the addAll() method it adds the values of the array to the linkedHashSet.
	 * Next it calls the method printSet() of the SetUtilities class which prints all the items in the linkedHashSet.
	 * @param setUtils
	 */
	public static void testLinkedHashSet(SetUtilities setUtils) {	
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		String addAtOnce[] = {"One","Two","Three","Four"};
		linkedHashSet.addAll(Arrays.asList(addAtOnce));	
		setUtils.printSet(linkedHashSet);
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
	
	
	
	/*public static List combineArrays(String[] array1, String[] array2) {
		List<String> assorted = new ArrayList<String>(Arrays.asList(array1));
		assorted.addAll(Arrays.asList(array2));
		return assorted;
	}*/
	
	


}
