package week1.w1_code;

import java.math.BigInteger;

public class OptimizedMultiplier {
	public static BigInteger standardMultiply(BigInteger x, BigInteger y) {
		BigInteger ret = BigInteger.ZERO;
		int i = 0;
		while (i < y.bitLength()) {
			if (y.testBit(i)) {
				ret = ret.add(x.shiftLeft(i));
			}
			++i;
		}
		return ret;
	}

	public static BigInteger fastMultiply(BigInteger x, BigInteger y) {
		int xLen = x.bitLength();
		int yLen = y.bitLength();
	
		if (x.equals(BigInteger.ONE)) {
			return y;
		}
	
		if (y.equals(BigInteger.ONE)) {
			return x;
		}
		
		BigInteger ret = BigInteger.ZERO;
		int N = Math.max(xLen, yLen);
	
		if (N <= 800) {
			
			ret = x.multiply(y);
		} else if (Math.abs(xLen - yLen) >= 32) {
			
			ret = OptimizedMultiplier.standardMultiply(x, y);
		} else {
			
			N = N / 2 + N % 2;
			BigInteger b = x.shiftRight(N);
			BigInteger a = x.subtract(b.shiftLeft(N));
			BigInteger d = y.shiftRight(N);
			BigInteger c = y.subtract(d.shiftLeft(N));
			BigInteger ac = OptimizedMultiplier.fastMultiply(a, c);
			BigInteger bd = OptimizedMultiplier.fastMultiply(b, d);
			BigInteger crossterms = OptimizedMultiplier.fastMultiply(a.add(b),
					c.add(d));
			ret = ac.add(crossterms.subtract(ac).subtract(bd).shiftLeft(N))
					.add(bd.shiftLeft(2 * N));
		}
		return ret;
	}

}
