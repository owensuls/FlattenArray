//Copyright (c) 2016 Acme Inc., All Rights Reserved.
package com.suls.owen;

import java.util.List;
import java.util.ArrayList;

/**
 * This application takes as input an arbitrarily nested array, and returns a flattened array.
 * @author owen.suls@gmail.com
 */
public class FlattenArray {
	
	/**
	 * This is the main method which returns an informative message to the user.
	 * @param args
	 * @return Nothing
	 */
	public static void main(String[] args) {

		System.out.println("This application is used to flatten arrays of integers. Pass an array to the flatten method to use it.");
	}

	/**
	 * This method receives a nested array and returns a flattened array.
	 * @param objectIn Array of nested integers to be flattened. 
	 * @return Flattened array.
	 */
	public Integer[] flatten(Object[] objectIn) {

		List<Integer> list = new ArrayList<>();
		
		recursivelyFlatten(objectIn, list);
				
		Integer[] arrayOut = list.toArray(new Integer[list.size()]);
		
		for (Integer i : arrayOut) {
		    System.out.print(i + " ");		
		}

		return arrayOut;
	}

	/**
	 * This method recursively handles the flattening of the array.
	 * @param objectIn Array of nested integers to be flattened. 
	 * @param list Flattened list of integers.
	 * @return Nothing.
	 */
	private void recursivelyFlatten(Object[] objectIn, List<Integer> list) {
		
		for (Object object : objectIn) {
			if (object instanceof Integer) {
				list.add((Integer) object);
			}
			else {
				recursivelyFlatten((Object[]) object, list);
			}
		}
	}
}