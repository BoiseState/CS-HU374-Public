package w2_test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.TriangleClassifier;
import code.TriangleClassifier.TriangleType;

public class TraingleClassifierTest {

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


}
