package com.capgemini.testFindMax;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.capgemini.findMax.FindMaximum;

public class testFindMaximum {
	
	@Test
	public void maximumAtFirstPosition() {
		Float maximum = FindMaximum.findMax(50.0f,30.0f,-10.0f);
		assertTrue(50.0f==maximum);
	}
	
	@Test
	public void maximumAtSecondPosition() {
		Float maximum = FindMaximum.findMax(30.0f,50.0f,-10.0f);
		assertTrue(50.0f==maximum);
	}
	
	@Test
	public void maxAtFirstPosition() {
		Float maximum = FindMaximum.findMax(30.0f,-10.0f,50.0f);
		assertTrue(50.0f==maximum);
	}
}
