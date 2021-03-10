package com.junit.training.rules;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleUsingException {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void validaException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectCause(isA(IllegalArgumentException.class));
		throw new IllegalArgumentException("Esto no es valido", new NullPointerException());
	}
}
