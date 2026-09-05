// Last updated: 9/5/2026, 12:29:04 PM
class Solution {
    public boolean canBeIncreasing(int[] nums) {
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
    }

    
