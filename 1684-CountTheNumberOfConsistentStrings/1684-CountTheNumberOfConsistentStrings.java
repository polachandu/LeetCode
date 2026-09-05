// Last updated: 9/5/2026, 12:29:56 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int num = 0;
		for (int i = 0; i < words.length; i++) {
			int n = 0;
			for (int j = 0; j < words[i].length(); j++) {
				
				if (allowed.indexOf(words[i].charAt(j)) == -1) {
					break;
				} else {
					//System.out.println(words[i]);
					n++;
					//System.out.println(n);
				}
			}
			if (n == words[i].length()) {
				
				num++;
				//System.out.println(num);
			}
		}
		return num;
    }
}