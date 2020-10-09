package com.capgemini.testFindMax;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.capgemini.findMax.FindMaximum;

public class testFindMaximum {
	
	@Test
	public void maximumAtFirstPosition() {
		String maximum = FindMaximum.findMax("Peach", "Apple", "Banana");
		assertTrue("Peach".equals(maximum));
	}
	
	@Test
	public void maximumAtSecondPosition() {
		String maximum = FindMaximum.findMax("Apple", "Peach", "Banana");
		assertTrue("Peach".equals(maximum));
	}
	
	@Test
	public void maxAtFirstPosition() {
		String maximum = FindMaximum.findMax("Apple", "Banana", "Peach");
		assertTrue("Peach".equals(maximum));
	}
}
