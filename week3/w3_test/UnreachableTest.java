package w3_test;

import static org.junit.Assert.*;

import org.junit.Test;

import w3_code.Unreachable;

public class UnreachableTest {
	@Test
	public void test1() {
		boolean ret = Unreachable.test(1, 1);
		assertTrue(ret);
	}
	
	@Test
	public void test2() {
		boolean ret = Unreachable.test(-1, 1);
		assertTrue(ret);
	}

	@Test
	public void test3() {
		boolean ret = Unreachable.test(1, -1);
		assertTrue(ret);
	}
}
