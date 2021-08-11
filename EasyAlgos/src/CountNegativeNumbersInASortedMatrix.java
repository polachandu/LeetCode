//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
//Example 1:
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.

//Example 2:
//Input: grid = [[3,2],[1,0]]
//Output: 0

//Example 3:
//Input: grid = [[1,-1],[-1,-1]]
//Output: 3

//Example 4:
//Input: grid = [[-1]]
//Output: 1
public class CountNegativeNumbersInASortedMatrix {
	public static int countNegatives(int[][] grid) {
		int count =0;
	        for(int i=0;i<grid.length;i++) {
	        	for(int j=0;j<grid[i].length;j++) {
	        		if(grid[i][j]<0) {
	        			count++;
	        		}
	        	}
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(countNegatives(intArray));
		
		int[][] intArray1 = {{3,2},{1,0}};
		System.out.println(countNegatives(intArray1));
		
		int[][] intArray2 = {{1,-1},{-1,-1}};
		System.out.println(countNegatives(intArray2));
		
		int[][] intArray3 = {{-1}};
		System.out.println(countNegatives(intArray3));
	}

}
