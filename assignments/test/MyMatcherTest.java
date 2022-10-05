package test;

import static org.junit.Assert.*;

import org.junit.Test;

import a1.MyMatcher;

public class MyMatcherTest {

	@Test
	public void test1() {
		//set up the arrays -- you can do in two ways
		//as assigning an array of chars
		char[] thisVal = {'a', 'b', 'c'};
		//as converting a string to an array of chars
		char[] otherVal = "bc".toCharArray();//the same as = {'b', 'c'}
		
		boolean ret = MyMatcher.regionMatches(false, thisVal, 1, otherVal, 0, 2);
		assertTrue(ret);
		
	}
	
	@Test
	public void test2() {
		//set up the arrays -- you can do in two ways
		//as assigning an array of chars
		char[] thisVal = {'a', 'B', 'c'};
		//as converting a string to an array of chars
		char[] otherVal = "bc".toCharArray();//the same as = {'b', 'c'}
		
		boolean ret = MyMatcher.regionMatches(true, thisVal, 1, otherVal, 0, 2);
		assertTrue(ret);
		
	}

}
