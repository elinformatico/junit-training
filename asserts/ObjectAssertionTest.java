package com.junit.training.asserts;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;

@DisplayName("Running different kind of asserts")
public class ObjectAssertionTest {

	@Nested
	@DisplayName("Validating Booleans")
	class BooleanValidations 
	{
		@Test
		@DisplayName("WhenBooleanIsTrue ")
		void shouldBeTrue() {
			assertTrue(true);
		}
		
		@Test
        @DisplayName("WhenBooleanIsFalse")
        void shouldBeFalse() {
            assertFalse(false);
        }
	}
	
	@Nested
	@DisplayName("Validating Objects")
	class Objets  
	{	
		private Object ACTUAL;
        private Object EXPECTED;
        
        @BeforeClass
        void setupValues () {
        	this.ACTUAL = 9;
        	this.EXPECTED = 9;
        }
        
		@Test
		@DisplayName("When is Null")
		void shouldBeNull() {
			assertNull(null);
		}
		
		@Test
		@DisplayName("When is not Null")
		void shouldBeNotNull() {
			StringBuilder str = new StringBuilder("Hello Word!!");
			assertNotNull(str);
		}
		
		 @Test
         @DisplayName("Should be equal")
         void shouldBeEqual() {
             assertEquals(EXPECTED, ACTUAL);
         }
		
		 @Test
         @DisplayName("Should not be equal")
         void shouldNotBeEqual() {
			 this.ACTUAL = 9;
			 this.ACTUAL = 4;
			 assertNotEquals(EXPECTED, ACTUAL);
         } 
		 
		 @Test
	     @DisplayName("Should refer to the same object")
		 void shouldReferToSameObject() {
			 ACTUAL = new Object();
		     EXPECTED = ACTUAL;
			 
			 assertSame(EXPECTED, ACTUAL);
		 }
		 
		 @Test
		 @DisplayName("Should not refer to the same object")
		 void shouldNotReferToSameObject() {
			 ACTUAL = new Object();
		     EXPECTED = new Object();
			 assertNotSame(EXPECTED, ACTUAL);
		 }
	}
	
	@Nested
	@DisplayName("Array Assertion Test")
	class ArrayAssertionTest   
	{
		int[] ACTUAL; 
        int[] EXPECTED;
        
        @Test
        @DisplayName("Should contain the same integers")
        void shouldContainSameIntegers() 
        {
        	ACTUAL = new int[]{2, 5, 7};
        	EXPECTED = new int[]{2, 5, 7};	
            assertArrayEquals(EXPECTED, ACTUAL);
        }
        
        @Test
        @DisplayName("Should contain the same elements")
        void shouldContainSameElements() 
        {
        	List<Integer> FIRST = Arrays.asList(1, 2, 3);
            List<Integer> SECOND = Arrays.asList(1, 2, 3);
            
            assertIterableEquals(FIRST, SECOND);
        }
	}
	
	@Nested
	@DisplayName("AssertThat Assertions")
	class AssertThatAssertions   
	{
		int totalNumberOfApplicants = 0;
		@Before
		public void setData(){
			this.totalNumberOfApplicants = 9;
		}

		@Test
		@DisplayName("Assert That Equal")
		public void testAssertThatEqual() {
			assertThat("123", is("123"));
		}

		@Test
		@DisplayName("Assert That Not Equal")
		public void testAssertThatNotEqual() {
			assertThat(totalNumberOfApplicants,is(123));
		}

		@Test
		@DisplayName("Assert That Object")
		public void testAssertThatObject() {
			assertThat("123",isA(String.class));
		}

		@Test
		@DisplayName("Assert That Message")
		public void testAssertThatWMessage(){
			assertThat("They are not equal!","123",is("1234"));
		}

		@Test
		@DisplayName("Assert That")
		public void testAssertThatAnyOf()
		{
			// assertThat("123",is("1234"));
			assertThat("Bienvenido a nuestro team", anyOf(
					containsString("welcome"), 
					containsString("our"),
					containsString("team")
			));
			
		}

	}
}
