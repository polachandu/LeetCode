//Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward. 
//For example, 121 is palindrome while 123 is not.

//Example 1:
//Input: x = 121
//Output: true

//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

//Example 4:
//Input: x = -101
//Output: false

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
		System.out.println("-----");
		System.out.println(isPalindrome(-121));
		System.out.println("-----");
		System.out.println(isPalindrome(10));
		System.out.println("-----");
		System.out.println(isPalindrome(-101));
		System.out.println("-----");

	}
	public static boolean isPalindrome(int x) {
        if(x>0){
        	int number =x;
            int lastDigit =0;
            int reverseNumber = 0;
            while(x!=0){
                lastDigit = x%10;
                reverseNumber = reverseNumber*10+lastDigit;
                x = x/10;
            }
            //System.out.println(reverseNumber);
            
            if (number == reverseNumber){
                return true;
            }else {
            	return false;
            }
        }
        else{
            return false;
        }
	
    }

}
