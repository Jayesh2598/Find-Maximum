package com.capgemini.testFindMax;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.capgemini.findMax.FindMaximum;

public class testFindMaximum {
	
	@Test
	public void maximumAtFirstPosition() {
		Integer maximum = FindMaximum.findMax(50,30,-10);
		assertTrue(50==maximum);
	}
	
	@Test
	public void maximumAtSecondPosition() {
		Integer maximum = FindMaximum.findMax(30,50,-10);
		assertTrue(50==maximum);
	}
	
	@Test
	public void maxAtFirstPosition() {
		Integer maximum = FindMaximum.findMax(30,-10,50);
		assertTrue(50==maximum);
	}
}
