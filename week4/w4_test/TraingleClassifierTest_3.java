package week4.w4_test;

import static org.junit.Assert.*;

import org.junit.Test;

import week4.w4_code.TriangleClassifier;
import week4.w4_code.TriangleClassifier.TriangleType;

/*
 * An example of what the fuzzer would output depending on the
 * value of the input parameter N
 */
public class TraingleClassifierTest_3 {

	@Test
	public void test1() {
		/*TC1, Spec1, boundary with Invalid and Equilateral */
		TriangleType type = TriangleClassifier.classify(2,2, 1);
		assertEquals(type,TriangleType.ISOSCELES);
	}
	
	@Test
	public void test2() {
		/*TC2, Spec1, inside the partition with c changes*/
		TriangleType type = TriangleClassifier.classify(5,5,4);
		assertEquals(type,TriangleType.ISOSCELES);
	}
	
	@Test
	public void test3() {
		TriangleType type = TriangleClassifier.classify(-1351673479,-1158107505,-2062474596);
		assertEquals(type,TriangleType.INVALID);
	}


}
