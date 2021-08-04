//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//Example 1:
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.

//Example 2:
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false

//Example 3:
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true



import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
	
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        StringBuffer sb1 = new StringBuffer();
	        for(int i=0;i<word1.length;i++) {
	        	sb1.append(word1[i]);
	        }
	        String str1 = sb1.toString();
	        System.out.println(str1);
	        StringBuffer sb2 = new StringBuffer();
	        for(int j=0;j<word2.length;j++) {
	        	sb2.append(word2[j]);
	        }
	        String str2 = sb2.toString();
	        System.out.println(str2);
	        if(str1.equals(str2)) {
	        	return true;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
		
		String[] word3 = {"abc", "d", "defg"};
		String[] word4 = {"abcddefg"};
		System.out.println(arrayStringsAreEqual(word3, word4));
	}

}
