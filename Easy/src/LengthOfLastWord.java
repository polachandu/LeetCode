//Given a string s consists of some words separated by spaces, return the length of the last word in the string.
//If the last word does not exist, return 0.
//A word is a maximal substring consisting of non-space characters only.

//Example 1:
//Input: s = "Hello World"
//Output: 5

//Example 2:
//Input: s = " "
//Output: 0




import java.util.Arrays;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("       "));
		System.out.println(lengthOfLastWord("a"));
		System.out.println(lengthOfLastWord(" "));
		System.out.println(lengthOfLastWord("a "));

		


		

	}
	 public static int lengthOfLastWord(String s) {
		        int count = 0;
		        if (s == null || s.length()==0) {
		            return 0;
		        }
		        String[] words = s.split("\\s+");
		        System.out.println(Arrays.toString(words));
		        if (words.length >= 1) {
		            for (int i = 0; i < words[words.length - 1].length(); i++) {
		                count++;
		            }
		        }
		        return count;
		    }
	 }


