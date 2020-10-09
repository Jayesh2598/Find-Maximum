package com.capgemini.testFindMax;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.capgemini.findMax.FindMaximum;

public class testFindMaximum {
	
	@Test
	public void maximumAtFirstPosition() {
		Integer maxInteger = FindMaximum.findMaximum(50,30,-10);
		assertTrue(50==maxInteger);
		Float maxFloat = FindMaximum.findMaximum(50.0f,30.0f,-10.0f);
		assertTrue(50.0f==maxFloat);
		String maxString = FindMaximum.findMaximum("Peach", "Apple", "Banana");
		assertTrue("Peach".equals(maxString));
	}
	
	@Test
	public void maximumAtSecondPosition() {
		Integer maxInteger = FindMaximum.findMaximum(30,50,-10);
		assertTrue(50==maxInteger);
		Float maxFloat = FindMaximum.findMaximum(30.0f,50.0f,-10.0f);
		assertTrue(50.0f==maxFloat);
		String maximum = FindMaximum.findMaximum("Apple", "Peach", "Banana");
		assertTrue("Peach".equals(maximum));
	}
	
	@Test
	public void maxAtFirstPosition() {
		Integer maxInteger = FindMaximum.findMaximum(30,-10,50);
		assertTrue(50==maxInteger);
		Float maxFloat = FindMaximum.findMaximum(30.0f,-10.0f,50.0f);
		assertTrue(50.0f==maxFloat);
		String maximum = FindMaximum.findMaximum("Apple", "Banana", "Peach");
		assertTrue("Peach".equals(maximum));
	}
}
