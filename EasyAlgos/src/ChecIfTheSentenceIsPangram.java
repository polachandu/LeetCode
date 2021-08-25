//A pangram is a sentence where every letter of the English alphabet appears at least once.
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

//Example 1:
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.

//Example 2:
//Input: sentence = "leetcode"
//Output: false


public class ChecIfTheSentenceIsPangram {
	
	
	public static boolean checkIfPangram(String sentence) {
		 String alpha = "abcdefghijklmnopqrstuvwxyz";
	        for(int i=0;i<alpha.length();i++){
	            if(sentence.indexOf(alpha.charAt(i))==-1){
	                return false;
	            }
	        }return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(checkIfPangram("leetcode"));
		System.out.println(checkIfPangram("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo"));


	}

}
