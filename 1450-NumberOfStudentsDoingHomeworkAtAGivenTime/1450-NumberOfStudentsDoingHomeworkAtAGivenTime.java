// Last updated: 9/5/2026, 12:30:44 PM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count =0;
	        for(int i=0;i<startTime.length;i++) {
	        	if(startTime[i]<=queryTime && endTime[i]>= queryTime) {
	        		count++;
	        	}
	        }
	        return count;
    }
}