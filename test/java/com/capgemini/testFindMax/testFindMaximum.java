package com.capgemini.testFindMax;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.capgemini.findMax.FindMaximum;

public class testFindMaximum {

	FindMaximum<Integer> maxInt = new FindMaximum<>();
	FindMaximum<Float> maxFloat = new FindMaximum<>();
	FindMaximum<String> maxString = new FindMaximum<>();

	@Test
	public void maximumAtFirstPosition() {
		Integer maxinteger = maxInt.findMaximum(50, 30, -10);
		assertTrue(50 == maxinteger);
		Float maxfloat = maxFloat.findMaximum(50.0f, 30.0f, -10.0f);
		assertTrue(50.0f == maxfloat);
		String maxstring = maxString.findMaximum("Peach", "Apple", "Banana");
		assertTrue("Peach".equals(maxstring));
	}

	@Test
	public void maximumAtSecondPosition() {
		Integer maxinteger = maxInt.findMaximum(30, 50, -10);
		assertTrue(50 == maxinteger);
		Float maxfloat = maxFloat.findMaximum(30.0f, 50.0f, -10.0f);
		assertTrue(50.0f == maxfloat);
		String maxstring = maxString.findMaximum("Apple", "Peach", "Banana");
		assertTrue("Peach".equals(maxstring));
	}

	@Test
	public void maxAtFirstPosition() {
		Integer maxinteger = maxInt.findMaximum(30, -10, 50);
		assertTrue(50 == maxinteger);
		Float maxfloat = maxFloat.findMaximum(30.0f, -10.0f, 50.0f);
		assertTrue(50.0f == maxfloat);
		String maxstring = maxString.findMaximum("Apple", "Banana", "Peach");
		assertTrue("Peach".equals(maxstring));
	}
}
