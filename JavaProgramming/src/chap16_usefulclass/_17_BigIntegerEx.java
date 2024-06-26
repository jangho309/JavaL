package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 까지 곱한 값을 구하세요.
//		BigInteger bignum = new BigInteger("1");
		BigInteger bignum = BigInteger.ONE;
		
//		String castNum = "";
//		BigInteger tempBigInt = null;
		for(int i = 1; i <= 100; i++) {
//			castNum = Integer.toString(i);
//			tempBigInt = new BigInteger(castNum);
////			System.out.println("tempBigInt : " + tempBigInt);
//			bignum = bignum.multiply(tempBigInt);
			
			bignum = bignum.multiply(BigInteger.valueOf(i));
			
		}
		
		// "1" -> 1
		// 1 -> bigInt(1)
		// bignum * bigInt(1)
		System.out.println("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000".length());
		System.out.println(bignum);
		
		long num = factorial(10);
		
		System.out.println(num);
		
//		System.out.println( factorialBigInteger(BigInteger.valueOf(20L)));
		
		
		// 1! = 1
		// 2! = 2
		// 3! = 6
		// ..
		// 100! = 9333.......
		for(Long i = 1L; i <= 100L; i++) {
			System.out.println((i) + "! = " + factorialBigInteger(BigInteger.valueOf(i)));
		}
	}

	/**
	 * 재귀메소드
	 * public returnType 메소드명(파라미터){
	 * 
	 * 		return 메소드명(파라미터);
	 * }
	 */
	
	public static long factorial(long num) {
		if(num == 0) {
			return 1;
		} else {
			//재귀메소드: 현재 메소드를 구현부안에서 호출
			// num = 10이 들어오면
			// 10 * factorial(9)
			// 10 * 9 * factorial(8)
			// 10 * 9 * 8 * factorial(7)
			// ....
			// 10 * 9 * 8 * 7 * ... * factorial(0)
			return num * factorial(num - 1);
		}
	}
	
	public static BigInteger factorialBigInteger(BigInteger bigInt) {
		if(bigInt.intValue() == 0) {
			return BigInteger.ONE;
		} else {
			return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.ONE)));
		}
	}
}
