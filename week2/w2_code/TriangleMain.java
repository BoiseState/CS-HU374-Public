package week2.w2_code;

import code.TriangleClassifier;
import code.TriangleClassifierFaulty;

/*Code example showing how
 * to use TriangleClassifier
 * correct and faulty versions
 * Equilateral: type = 0
 * Invalid: type = 1
 * Isosceles: type = 2;
 * Scalene: type = 3;
 *
 */
public class TriangleMain {
	
	public static void main(String[] args) {
		int type = 1;
		type = TriangleClassifier.classify(5, 5, 3);
		System.out.println(type == 0);
		
		int type1 = 1;
		type1 = TriangleClassifierFaulty.classify(5, 5, 5);
		System.out.println(type1 == 0);
	}

}
