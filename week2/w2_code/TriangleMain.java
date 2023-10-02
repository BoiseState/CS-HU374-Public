package week2.w2_code;

import code.TriangleClassifier.TriangleType;
import code.TriangleClassifier;
import code.TriangleClassifierFaulty;

/*Code example showing how
 * to use TriangleClassifier
 * correct and faulty versions
 */
public class TriangleMain {
	
	public static void main(String[] args) {
		TriangleType type = TriangleType.INVALID;
		type = TriangleClassifier.classify(5, 5, 3);
		System.out.println(type == TriangleType.EQUILATERAL);
		
		TriangleClassifierFaulty.TriangleType type1 = TriangleClassifierFaulty.TriangleType.INVALID;
		type1 = TriangleClassifierFaulty.classify(5, 5, 5);
		System.out.println(type1 == TriangleClassifierFaulty.TriangleType.EQUILATERAL);
	}

}
