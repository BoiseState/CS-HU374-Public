package week2.w2_test;

import code.TriangleClassifier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraingleClassifierTest {

	@Test
	public void test1() {
		/*TC1, Spec1, boundary with Invalid and Equilateral */
		int type = TriangleClassifier.classify(2,2, 1);
		assertEquals(type,2);
	}
	
	@Test
	public void test2() {
		/*TC2, Spec1, inside the partition with c changes*/
		int type = TriangleClassifier.classify(5,5,4);
		assertEquals(type,2);
	}


}
