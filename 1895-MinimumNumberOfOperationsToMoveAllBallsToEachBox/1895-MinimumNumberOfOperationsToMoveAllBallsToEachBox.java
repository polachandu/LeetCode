// Last updated: 8/12/2026, 11:09:14 AM
class Solution {
    public int[] minOperations(String boxes) {
        int[] answers = new int[boxes.length()];
	        for(int i=0;i<boxes.length();i++) {
	        		for(int j=0;j<boxes.length();j++) {
	        			if(boxes.charAt(j)=='1') {
	        				answers[i] += Math.abs(i-j);
	        			}
	        		}
	        }
	        return answers;
    }
}