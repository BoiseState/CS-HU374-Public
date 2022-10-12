package w3_code;

public class Unreachable {
	
	public static boolean test(int x, int y) {
		boolean ret = false; //1 tc: false, false, true, 2 tc: false, true, false, 3tc: true, false, false
		boolean gr = x > y;
		boolean less = x < y;
		boolean eq = x == y;
		if( gr || less || eq) {
			System.out.println("Yes");
			ret = true;
		}
		return ret;
	}
	
}
