// Last updated: 8/12/2026, 11:09:44 AM
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