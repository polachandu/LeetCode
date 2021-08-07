import java.util.HashSet;

public class UniqueMorseCodeWords {
	public static int uniqueMorseRepresentations(String[] words) {
		HashSet<String> h = new HashSet<>();
		String[] a= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        for(int i=0;i<words.length;i++) {
	        	String s = words[i];
	        	String o ="";
	        	for(int j=0;j<s.length();j++) {
	        		o+=a[s.charAt(j)-97];
	        	}
	        	System.out.println(o);
	        	h.add(o);
	        }
	        return h.size();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"gin","zen","gig","msg"};
		System.out.println(uniqueMorseRepresentations(arr));
	}

}
