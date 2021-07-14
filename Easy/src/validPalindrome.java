//Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

//Example 2:
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.

public class validPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("0P"));
		System.out.println(isPalindrome("a"));

	}
	public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);
        if(s.length()==1) {
        	return true;
        }
        int n = s.length()-1;
        for(int i=0;i<((n+1)/2);i++) {
        	if(s.charAt(i)!=s.charAt(n-i)) {
        		return false;
        	}
        		
        	}return true;

}}
