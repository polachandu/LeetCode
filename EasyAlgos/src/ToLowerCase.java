//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
//Example 1:
//Input: s = "Hello"
//Output: "hello"

//Example 2:
//Input: s = "here"
//Output: "here"

//Example 3:
//Input: s = "LOVELY"
//Output: "lovely"
public class ToLowerCase {
	
	public static String toLowerCase(String s) {
	      return s.toLowerCase(); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLowerCase("Hello"));
		System.out.println(toLowerCase("here"));
		System.out.println(toLowerCase("LOVELY"));


	}

}
