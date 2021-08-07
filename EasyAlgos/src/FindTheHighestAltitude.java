//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. 
//The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
//Return the highest altitude of a point.
//
//Example 1:
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

//Example 2:
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


import java.util.Arrays;

public class FindTheHighestAltitude {
	public static int largestAltitude(int[] gain) {
		int n = gain.length;
		int m=n+1;
	     int[] newGain = new int[m];
	     newGain[0] =0;
	     for(int i=1;i<newGain.length;i++) {
	    	 newGain[i] = gain[i-1]+newGain[i-1];
	     }
	     int max = Arrays.stream(newGain).max().getAsInt();
	     return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-5,1,5,0,-7};
		System.out.println(largestAltitude(intArray));
		
		int[] intArray1 = {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(intArray1));
	}

}
