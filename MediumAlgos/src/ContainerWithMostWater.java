//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
//n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
//Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
//
//Notice that you may not slant the container.
// 
//Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

//Example 2:
//Input: height = [1,1]
//Output: 1

//Example 3:
//Input: height = [4,3,2,1,4]
//Output: 16

//Example 4:
//Input: height = [1,2,1]
//Output: 2


import java.util.Arrays;

public class ContainerWithMostWater {
	
	public static int maxArea(int[] height) {
		if(height ==null || height.length<2)
	        return 0;
	    //Using  two pointer approach
	    int n = height.length;
	    int low = 0, high = n-1;
	    int maxArea = 0 ;
	    while(low<=high){
	        int area = (high-low)*Math.min(height[low], height[high]);
	        maxArea = Math.max(area,maxArea);
	        if(height[low] < height[high])
	            low++;
	        else
	            high--;
	    }
	    return maxArea;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(intArray));
		int[] intArray1 = {1,1};
		System.out.println(maxArea(intArray1));
		int[] intArray2 = {4,3,2,1,4};
		System.out.println(maxArea(intArray2));
	}

}
