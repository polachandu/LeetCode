// Last updated: 9/5/2026, 12:31:09 PM
class Solution {
    public int[] sumZero(int n) {
         int i = 0,j = n-1;
	        int ar[] = new int[n];
	        while(i<j){
	            ar[i]=j;
	            ar[j]=-j;
	            i++;
	            j--;
	        }
        return ar;
    }
}