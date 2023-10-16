package week4.w4_code;

public class TriangleClassifierFaulty {
	
	public enum TriangleType {
	    EQUILATERAL, INVALID, ISOSCELES, SCALENE
	}
	
	public static TriangleType classify(int a, int b, int c) {
		TriangleType ret = TriangleType.SCALENE;
	    if (a <= 0 || b <= 0 || c < 0) {
	    	ret = TriangleType.INVALID; 
	    } else if (a == b && b == c) {
	    	ret = TriangleType.EQUILATERAL;
	    } else if (a > b+c || c >= b+a || b >= a+c) {
	    	ret = TriangleType.INVALID;
	    } else if (b==c || a==b || c==a) {
	    	ret = TriangleType.ISOSCELES;
	    }
	    return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(classify(3,5, 7));
	}

}
