// Last updated: 8/12/2026, 11:11:09 AM
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