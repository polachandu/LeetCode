//Write a function that reverses a string. The input string is given as an array of characters s.

//Example 1:
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

//Example 2:
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]


public class printArrayInReverse {

		  public static void helper(char[] s, int left, int right) {
		    if (left >= right) return;
		    char tmp = s[left];
		    s[left++] = s[right];
		    s[right--] = tmp;
		    helper(s, left, right);
		  
		  }

		  public static void reverseString(char[] s) {
		    helper(s, 0, s.length - 1);
		    System.out.println(s);
		  }
		
	            
	            
	        
	        
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = {'c','h','a','n','d','u'};
		reverseString(charArray);

	}

}
