package com.learn.set;

import java.util.HashSet;
import java.util.Set;

public class SetUtilities {
	
	Set <String> hashSet = new HashSet<String>();
	
	public boolean addNames(String name) {
		boolean test = hashSet.add(name);
		System.out.println(test);
		return test;
	}

	public Set<String> getHashSet() {
		return hashSet;
	}
	
	public void printSet(Set<String> set) {
		for (String setVal :  set) {
			System.out.println(setVal);
		}	
	}	
}
