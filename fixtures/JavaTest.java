package com.junit.training.fixtures;

import junit.framework.*;

public class JavaTest extends TestCase {
	   protected int value1, value2;

	   
	   // asignando valores
	   protected void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }

	   // metodo test para agregar dos valores
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
	   }
	}
