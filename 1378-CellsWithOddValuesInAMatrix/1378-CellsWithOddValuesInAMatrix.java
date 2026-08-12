// Last updated: 8/12/2026, 11:11:27 AM
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
		int arr[][]=new int [m][n];
		for(int i=0;i<indices.length;i++) {
			int r=indices[i][0];
			int c=indices[i][1];
			
			for(int j=0;j<m;j++) {
				arr[j][c]++;
			}
			
			for(int j=0;j<n;j++) {
				arr[r][j]++;
			}
				
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				//System.out.print(arr[i][j]+" ");
				if(arr[i][j]%2!=0) {
					count++;
				}
			}//System.out.println();
		}
		
		return count;
    }
}