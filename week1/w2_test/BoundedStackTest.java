package w2_test;

import static org.junit.Assert.*;

import org.junit.Test;

import w1_code.BoundedStack;

public class BoundedStackTest {

	/* an empty stack, push an element x, top element should be x */
	@Test
	public void tc1() {
		/* Initial state set up */
		BoundedStack bStack = new BoundedStack(5);
		
		/* Input */
		Integer el = 5;
		bStack.push(el);
		
		/* Comparing to the expected value */
		assertEquals(el, bStack.top());
	}
	
	/* a sack with one element, remove an element, the stack's size should be 0 */
	@Test
	public void tc2() {
		/* Initial state set up */
		BoundedStack bStack = new BoundedStack(5);
		bStack.push(-3);
		
		/* Input */
		bStack.pop();
		
		/* Comparing to the expected value */
		assertEquals(0,bStack.getSize());
	}
	
	

}
