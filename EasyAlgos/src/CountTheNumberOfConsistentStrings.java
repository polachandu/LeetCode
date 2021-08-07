//You are given a string allowed consisting of distinct characters and an array of strings words. 
//A string is consistent if all characters in the string appear in the string allowed.
//Return the number of consistent strings in the array words.
//Example 1:
//Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
//Output: 2
//Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

//Example 2:
//Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
//Output: 7
//Explanation: All strings are consistent.

//Example 3:
//Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
//Output: 4
//Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

public class CountTheNumberOfConsistentStrings {

	public static int countConsistentStrings(String allowed, String[] words) {
		int num = 0;
		for (int i = 0; i < words.length; i++) {
			int n = 0;
			for (int j = 0; j < words[i].length(); j++) {
				
				if (allowed.indexOf(words[i].charAt(j)) == -1) {
					break;
				} else {
					System.out.println(words[i]);
					n++;
					System.out.println(n);
				}
			}
			if (n == words[i].length()) {
				
				num++;
				System.out.println(num);
			}
		}
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "ad", "bd", "aaab", "baa", "badab" };
		System.out.println(countConsistentStrings("ab", words));

		String[] words1 = { "a", "b", "c", "ab", "ac", "bc", "abc" };
		System.out.println(countConsistentStrings("abc", words1));
	}

}
