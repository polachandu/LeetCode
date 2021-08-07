//Given an array of integers arr, and three integers a, b and c. 
//You need to find the number of good triplets.
//A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
//0 <= i < j < k < arr.length
//|arr[i] - arr[j]| <= a
//|arr[j] - arr[k]| <= b
//|arr[i] - arr[k]| <= c
//Where |x| denotes the absolute value of x.
//Return the number of good triplets.
//
//Example 1:
//Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
//Output: 4
//Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

//Example 2:
//Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
//Output: 0
//Explanation: No triplet satisfies all conditions.
public class CountGoodTriplets {
	
	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
	       int count =0;
	       for(int i=0;i<arr.length;i++) {
	    	   for(int j=i+1;j<arr.length && j != i;j++) {
	    		   for(int k=j+1;k<arr.length && k != j && k != i;k++) {
	    			 int x = Math.abs(arr[i]-arr[j]);
	    			 int y = Math.abs(arr[j]-arr[k]);
	    			 int z = Math.abs(arr[i]-arr[k]);
	    			 if(x<=a && y<=b && z<=c) {
	    				 count++;
	    			 }
	    		   }
	    	   }
	       }
	       return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,0,1,1,9,7};
		System.out.println(countGoodTriplets(intArray,7,2,3));
		
		int[] intArray1 = {1,1,2,2,3};
		System.out.println(countGoodTriplets(intArray1,0,0,1));
		
		int[] intArray2 = {7,3,7,3,12,1,12,2,3};
		System.out.println(countGoodTriplets(intArray2,5,8,1));
	}

}
