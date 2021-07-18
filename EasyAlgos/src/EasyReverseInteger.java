//Given a signed 32-bit integer x, return x with its digits reversed. 
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

//Example 1:
//Input: x = 123
//Output: 321

//Example 2:
//Input: x = -123
//Output: -321

//Example 3:
//Input: x = 120
//Output: 21

//Example 4:
//Input: x = 0
//Output: 0


public class EasyReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123));
		System.out.println("----");
		System.out.println(reverse(120));
		System.out.println("----");
		System.out.println(reverse(-321));
		System.out.println("----");
		System.out.println(reverse(0));
		System.out.println("----");


	}
	public static int reverse(int x) {
        int reverseNumber = 0;
       while (x != 0)
       {
           if (reverseNumber > Integer.MAX_VALUE/10 || reverseNumber < -Integer.MIN_VALUE/10)
           {
               return 0;
           }
           int lastDigit = x%10;
           reverseNumber = reverseNumber * 10 + lastDigit;
           x /= 10;
       }  
       return reverseNumber;
   }

}

//INT_MAX
//Because , INT_MAX = 2147483647 = 2^31 -1
//INT_MAX/10 = 214748364
//So, if reverse > 214748364, say 214748365
//then definitely reverse*10 (2147483650) is overflowing
//
//Also, if reverse = INT_MAX/10 = 214748364
//Then reverse*10 = 2147483640
//But then pop must be <= 7 to avoid overflow

//INT_MIN

//Because , INT_MIN = -2147483648 = -(2^31)
//INT_MIN/10 = -214748364
//So, if reverse < -214748364, say -214748365
//then definitely reverse*10 (-2147483650) is overflowing
//
//Also, if reverse = INT_MIN/10 = -214748364
//Then  reverse*10 = -2147483640
//But then remain must be >= -8 (i.e. -8, -7, -6, -5 etc) to avoid overflow
//Adding those to -2147483640 will not go beyond INT_MIN limit
