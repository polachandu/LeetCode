// Last updated: 8/12/2026, 11:10:14 AM
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