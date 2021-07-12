//Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

//Example 1:
//Input: x = 4
//Output: 2

//Example 2:
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
public class Sqrt_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(8));
		System.out.println("-----nice strategy----");
		System.out.println(mySqrt1(4));
		System.out.println(mySqrt1(8));
	}
	public static int mySqrt(int x) {
        int y = (int)Math.sqrt(x);
        return y;
    }
	/*
	n <= x^(1/2) < n+1
	1 + 3 + 5 + 7 + ... + (2n - 1) = (1+(2n-1))*n/2 = n^2  (0_o)
*/
		public static int mySqrt1(int x) {
	    int oddN = 1, res = 0; 
		while (x > 0) {				//x= 4     //x=3          //|	
		    x -= oddN;				//x = 3 	// x = 0 	  //|
	        oddN += 2; 				//oddN = 3	//oddN = 5 	  //|	
			res += x < 0 ? 0 : 1; 	// res  =   //res = 	  //|	
		}
		return res; 
}
	
}
