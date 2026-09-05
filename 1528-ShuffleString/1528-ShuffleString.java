// Last updated: 9/5/2026, 12:30:23 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] newIndices = new char[s.length()];

	        for(int i=0;i<s.length();i++) {
	        	newIndices[indices[i]] = s.charAt(i);
	        }

	        StringBuilder str = new StringBuilder();
	        str.append(newIndices);
	        String singleString = str.toString();
	        return singleString;
    }
}