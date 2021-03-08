package com.junit.training.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParametrizedTest {

	private Integer a;
	private Integer b;
	private Integer expeted;
	
	@Parameters
	public static Iterable<Integer[]> getData() {
		
		List<Integer[]> obj = new ArrayList<>();
		obj.add(new Integer[] {3, 1, 4});
		obj.add(new Integer[] {2, 3, 5});
		obj.add(new Integer[] {3, 3, 6});
		obj.add(new Integer[] {3, 5, 2});
		
		return obj;
	}
	
	public ParametrizedTest(Integer a, Integer b, Integer expected) 
	{	
		this.a = a;
		this.b = b;
		this.expeted = expected;
	}
	
	@Test
	public void voidTest() 
	{	
		assertEquals(this.expeted, (this.a + this.b));
	}

}
