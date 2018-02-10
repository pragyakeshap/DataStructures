package com.mylearnings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyTestClass {

	@Test
	void test() {
		DuplicateCount dc = new DuplicateCount();
		int result = dc.count();
		Assert.assertEquals(5, result);
	}

}
