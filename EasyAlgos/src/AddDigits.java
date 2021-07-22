//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//
//Example 1:
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2 
//Since 2 has only one digit, return it.

//Example 2:
//Input: num = 0
//Output: 0

public class AddDigits {
	
	public static int addDigits(int num) {
        if(num == 0) {
        	return 0;
        }else if(num%9 == 0) {
        	return 9;
        }else {
        	num = num%9;
        }
        return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(38));
	}

}
