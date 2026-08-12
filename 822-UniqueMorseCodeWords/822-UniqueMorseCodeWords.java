// Last updated: 8/12/2026, 11:13:01 AM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> h = new HashSet<>();
		String[] a= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        for(int i=0;i<words.length;i++) {
	        	String s = words[i];
	        	String o ="";
	        	for(int j=0;j<s.length();j++) {
	        		o+=a[s.charAt(j)-97];
	        	}
	        	//System.out.println(o);
	        	h.add(o);
	        }
	        return h.size();
    }
}