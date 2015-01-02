package com.lipiji.textrefiner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTextRefiner {
	
	@Test
	public void filterPunctuation() {
		assertEquals("This is a cat", TextRefiner.filterPunctuation("This, is. a cat!$"));
	}
}
