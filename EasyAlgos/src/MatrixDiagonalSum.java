//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
//
//Example 1:
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.

//Example 2:
//Input: mat = [[1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1]]
//Output: 8

//Example 3:
//Input: mat = [[5]]
//Output: 5
public class MatrixDiagonalSum {
		
	public static int diagonalSum(int[][] mat) {
		int sum=0;
		int matSum=0;
	        for(int i=0;i<mat.length;i++) {
	        	for(int j=0;j<mat[i].length;j++) {
	        		if(i==j) {
	        		sum+=mat[i][j];
	        	}
	        }
	       }
	        int j=0;
	        for(int i=mat.length-1;i>=0;i--) {
	        	sum+=mat[i][j];
	        	j++;
	        }
	        if(mat.length%2 !=0 ) {
	        	matSum = sum - mat[mat.length/2][mat.length/2];
	        }
	        else {
	        	matSum = sum;
	        }
	        return matSum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagonalSum(matrix));
		
		
		int[][] matrix1 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		System.out.println(diagonalSum(matrix1));
		
		int[][] matrix2 = {{5}};
		System.out.println(diagonalSum(matrix2));
	}

}
