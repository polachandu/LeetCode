//Write an efficient algorithm that searches for a target value in an m x n integer matrix. 
//The matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
// 
//Example 1:
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//Output: true

//Example 2:
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
//Output: false

public class Searcha2DMatrixII {
	

	public static boolean searchMatrix(int[][] matrix, int target) {
        int m =  matrix.length;
        //System.out.println(m);
        int n = matrix[0].length;
        //System.out.println(n);
        int start =0;
        int end = n-1;
        while(start <m && end>= 0) {
        	if(matrix[start][end]==target) {
        		return true;
        	}
        	else if(matrix[start][end] > target) {
        		end--;
        	}else {
        		start++;
        	}
        }
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(searchMatrix(intArray, 5));
		int[][] intArray1 = {{1,1}};
		System.out.println(searchMatrix(intArray1, 2));
	}

}
