import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
	public static boolean canBeIncreasing(int[] nums) {
	         ArrayList al = new ArrayList<>();
	         for(int i=0;i<nums.length;i++) {
	        	 al.add(nums[i]);
	         }
	         for(int i=1;i<al.size();i++) {
	        	 int l = (int) al.get(i-1);
	        	 int m = (int) al.get(i);
	        	 if(l>=m) {
	        		 al.remove(i-1);
	        		 break;
	        	 }
	         }
	         //System.out.println(al.size());
	         for(int i=0;i<al.size();i++) {
	        	 System.out.println(al.get(i));
	         }
	         for(int i=1;i<al.size();i++) {
	        	 int a = (int) al.get(i-1);
	        	 int b = (int) al.get(i);
	        	 if(a>=b) {
	        		 return false;
	        	 }
	        	 
	         }
	      return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,10,5,7};
		System.out.println(canBeIncreasing(intArray));
		
		int[] intArray1 = {2,3,1,2};
		System.out.println(canBeIncreasing(intArray1));
		
		int[] intArray2 = {1,2,3,4,5};
		System.out.println(canBeIncreasing(intArray2));
		
		int[] intArray3 = {1,1,1,1,1};
		System.out.println(canBeIncreasing(intArray3));
		
		int[] intArray4 = {1,1};
		System.out.println(canBeIncreasing(intArray4));
		
		int[] intArray5 = {105,924,32,968};
		System.out.println(canBeIncreasing(intArray5));
		
	}

}
