import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,2,2,3};
		System.out.println(removeElement(intArray,3));
		
		int[] intArray1 = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(intArray1,2));
		
		

	}
	public static int removeElement(int[] nums, int val) {
	
			int count = 0;
			for(int i = 0;i<nums.length;i++) {
				if(nums[i]==val) {
					count++;
				}
			}
			int counter = count;
			while(count!=0) {
				for(int i=0;i<nums.length-1;i++) {
					if(nums[i]==val && nums[i+1]!=val) {
						int temp = nums[i];
						nums[i] = nums[i+1];
						nums[i+1] = temp;
					}
				}
				count--;
			}
			System.out.println(Arrays.toString(nums));
			return nums.length-counter;
	
    
	}
}


