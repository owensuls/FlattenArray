//Copyright (c) 2016 Acme Inc., All Rights Reserved.
package com.suls.owen.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.suls.owen.FlattenArray;
import java.util.Arrays;

/**
 * This class is used to perform unit testing of FlattenArray.
 * @author owen.suls@gmail.com
 */
public class FlattenArrayTest {
	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlattenSingleElement() {
		FlattenArray flattenArray = new FlattenArray();

		Integer values[] = { 0 };

		Integer expectedResponse[] = { 0 };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}

	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlattenTwoElements() {
		FlattenArray flattenArray = new FlattenArray();

		Integer values[][] = { { 0 }, { 10 } };

		Integer expectedResponse[] = { 0, 10 };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}
	
	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlattenSimpleArray() {
		FlattenArray flattenArray = new FlattenArray();

		Integer values[][] = { { 0, 1, 2 }, { 10, 11}, { 20 }, { 30, 31, 32 } };

		Integer expectedResponse[] = { 0, 1, 2, 10, 11, 20, 30, 31, 32 };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}

	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlatten3LevelDeepArray() {
		FlattenArray flattenArray = new FlattenArray();
		
		Object[] values = new Object[] { 
			new Object[] { 
				1, 2, new Object[] { 
					3 
				}
			}, 
			4 
		};
	
		Integer expectedResponse[] = { 1, 2, 3, 4 };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}

	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlatten6LevelDeepArray() {
		FlattenArray flattenArray = new FlattenArray();
		
		Object[] values = 
			new Object[] { 1,  
				new Object[] { 20, 21, 
					new Object[] { 30, 31, 32,
						new Object[] { 40, 41, 42, 43, 44,
							new Object[] { 50, 51, 52, 53, 54, 55,
								new Object[] { 60, 61, 62, 63, 64, 65, 66
								}
							}
						}
					}
				}
			};
	
		Integer expectedResponse[] = { 1, 20, 21, 30, 31, 32, 40, 41, 42, 43, 44, 50, 51, 52, 53, 54, 55, 60, 61, 62, 63, 64, 65, 66 };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}
	
	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlattenEmptyArray() {
		FlattenArray flattenArray = new FlattenArray();

		Integer values[][] = { };

		Integer expectedResponse[] = { };
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}

	/**
	 * Test method for
	 * {@link com.suls.owen.FlattenArray#flatten(Object[])}.
	 */
	@Test
	public final void testFlattenLargeArray() {
		FlattenArray flattenArray = new FlattenArray();

		Integer values[][] = { 
			{ 72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245 }, 
			{ 1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645 },
			{ 72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245 }, 
			{ 1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645 },
			{ 72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245 }, 
			{ 1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645 },
			{ 72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245 }, 
			{ 1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645 },
			{ 72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245 }, 
			{ 1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645 }
		};

		Integer expectedResponse[] = { 
			72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245, 
			1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645,
			72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245, 
			1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645,
			72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245, 
			1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645,
			72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245, 
			1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645,
			72, 23456, 12, 0, 1234567890, 234324, 45435435, 756756, 234234, 2343245, 
			1123, 11123, 11232, 23423, 45764745, 21321321, 3432423, 23423, 9808, 123, 432, 5645
		};		
		
		Integer actualResponse[] = flattenArray.flatten(values);

		assertTrue("Actual did not match expected.",
				Arrays.deepEquals(actualResponse, expectedResponse));
	}	
}