package week3.w3_code;

public class TriangleClassifier {

	public static int classify(int a, int b, int c) {
		int ret = 3;
	    if (a <= 0 || b <= 0 || c <= 0) {
	    	ret = 1;
	    } else if (a == b && b == c) {
	    	ret = 0;
	    } else if (a >= b+c || c >= b+a || b >= a+c) {
	    	ret = 1;
	    } else if (b==c || a==b || c==a) {
	    	ret = 2;
	    }
	    return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(classify(3,5, 7));
	}

}
