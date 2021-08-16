import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
	public static boolean canBeIncreasing(int[] nums) {
		int num[]=new int[nums.length-1];
		boolean f=false;
		if(asc(nums)) {
			return true;
		}
	for(int i=0;i<nums.length-1;i++) {
		if(nums[i]>=nums[i+1]) {
			if(i>0) {
			if(nums[i+1]<=nums[i-1]) {
				System.arraycopy(nums, 0, num, 0, i+1);
				System.arraycopy(nums, i+2, num, i+1,nums.length-i-2);
				System.out.println(Arrays.toString(num));
				f=asc(num);
				break;
			}}
			System.arraycopy(nums, 0, num, 0, i);
			System.arraycopy(nums, i+1, num, i,nums.length-i-1);
			System.out.println(Arrays.toString(num));
			f=asc(num);
				}
	}
		return f;
}

private static boolean asc(int[] num) {
	boolean flag=false;
	if(num.length==1) {
		return true;
	}
	for(int j=0;j<num.length-1;j++) {
		if(num[j]<num[j+1]) {
			flag=true;}
		else {
			flag=false;
			break;
		}
	}
	return flag;
	}
//	        	 
//	         }
//	      return true;
//		int num[] = new int[nums.length - 1];
//		boolean f = false;
//		if (asc(nums)) {
//			return true;
//		}
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] >= nums[i + 1]) {
//				if (i > 0) {
//					if (nums[i + 1] <= nums[i - 1]) {
//						System.arraycopy(nums, 0, num, 0, i + 1);
//						System.arraycopy(nums, i + 2, num, i + 1, nums.length - i - 2);
//						System.out.println(Arrays.toString(num));
//						f = asc(num);
//						break;
//					}
//				}
//				System.arraycopy(nums, 0, num, 0, i);
//				System.arraycopy(nums, i + 1, num, i, nums.length - i - 1);
//				System.out.println(Arrays.toString(num));
//				f = asc(num);
//			}
//		}
//		return f;
//	}
//
//	private static boolean asc(int[] num) {
//		boolean flag = false;
//		if (num.length == 1) {
//			return true;
//		}
//		for (int j = 0; j < num.length - 1; j++) {
//			if (num[j] < num[j + 1]) {
//				flag = true;
//			} else {
//				flag = false;
//				break;
//			}
//		}
//		return flag;
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 10, 5, 7 };
		System.out.println(canBeIncreasing(intArray));

		int[] intArray1 = { 2, 3, 1, 2 };
		System.out.println(canBeIncreasing(intArray1));

		int[] intArray2 = { 1, 2, 3, 4, 5 };
		System.out.println(canBeIncreasing(intArray2));

		int[] intArray3 = { 1, 1, 1, 1, 1 };
		System.out.println(canBeIncreasing(intArray3));

		int[] intArray4 = { 1, 1 };
		System.out.println(canBeIncreasing(intArray4));

		int[] intArray5 = { 105, 924, 32, 968 };
		System.out.println(canBeIncreasing(intArray5));

	}

}
