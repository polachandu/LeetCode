// Last updated: 8/12/2026, 11:11:22 AM
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int prevX = points[0][0];
	        int prevY = points[0][1];
	        int time=0;
	        for(int i=1;i<points.length;i++) {
	        	int X = points[i][0];
	        	int Y = points[i][1];
	        	time += Math.max(Math.abs(prevX-X), Math.abs(prevY-Y));
	        	prevX = X;
	        	prevY = Y;
	        }
	        return time;
    }
}