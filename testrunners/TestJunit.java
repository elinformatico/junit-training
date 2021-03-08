package com.junit.training.testrunners;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestJunit {

	@Test
	public void test1() {
		assertEquals(5, 5);
	}
	
	@Test
	public void test2() {
		fail();
	}
}
