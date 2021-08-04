
public class CountTheNumberOfConsistentStrings {
	
	
	public static int countConsistentStrings(String allowed, String[] words) {
		int count =0;
        for(int i=0;i<words.length;i++) {
        	if(words[i].contains(allowed)) {
        		count++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings("ab",words));
		
		String[] words1 = {"a","b","c","ab","ac","bc","abc"};
		System.out.println(countConsistentStrings("abc",words1));
	}

}
