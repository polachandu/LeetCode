//You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
//Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
//Notice that s contains uppercase and lowercase letters.
//Return true if a and b are alike. Otherwise, return false.
//
//Example 1:
//Input: s = "book"
//Output: true
//Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

//Example 2:
//Input: s = "textbook"
//Output: false
//Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
//Notice that the vowel o is counted twice.

//Example 3:
//Input: s = "MerryChristmas"
//Output: false

//Example 4:
//Input: s = "AbCdEfGh"
//Output: true

public class DetermineIfStringHalvesAreAlike {
	
		
	public static boolean halvesAreAlike(String s) {
		int count1 =0;
		int count2 =0;
	        char[] charArr = {'a','e','i','o','u','A','E','I','O','U'};
	        int a = s.length()/2;
	        char[] string1 = new char[a];
	        char[] string2 = new char[a];
	        for(int i=0;i<a;i++) {
	        	string1[i] = s.charAt(i);
	        }
	        for(int i=0;i<a;i++) {
	        	string2[i] = s.charAt(a+i);
	        }
	        for(int i=0;i<a;i++) {
	        	for(int j=0;j<charArr.length;j++) {
	        		if(string1[i]==charArr[j]) {
	        			count1++;
	        		}
	        		if(string2[i]== charArr[j]) {
	        			count2++;
	        		}
	        	}
	        }
	        if(count1 == count2) {
	        	return true;
	        }
	        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(halvesAreAlike("textbook"));
		System.out.println(halvesAreAlike("book"));
		System.out.println(halvesAreAlike("MerryChristmas"));
		System.out.println(halvesAreAlike("AbCdEfGh"));



	}

}
