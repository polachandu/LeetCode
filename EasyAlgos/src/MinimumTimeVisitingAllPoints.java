//On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi]. 
//Return the minimum time in seconds to visit all the points in the order given by points.
//You can move according to these rules:
//In 1 second, you can either:
//move vertically by one unit,
//move horizontally by one unit, or
//move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
//You have to visit the points in the same order as they appear in the array.
//You are allowed to pass through points that appear later in the order, but these do not count as visits.
//Example 1:
//Input: points = [[1,1],[3,4],[-1,0]]
//Output: 7
//Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
//Time from [1,1] to [3,4] = 3 seconds 
//Time from [3,4] to [-1,0] = 4 seconds
//Total time = 7 seconds

//Example 2:
//Input: points = [[3,2],[-2,2]]
//Output: 5

public class MinimumTimeVisitingAllPoints {
	
	
	public static int minTimeToVisitAllPoints(int[][] points) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(intArray));
		
		int[][] intArray1 = {{3,2},{-2,2}};
		System.out.println(minTimeToVisitAllPoints(intArray1));
	}

}
