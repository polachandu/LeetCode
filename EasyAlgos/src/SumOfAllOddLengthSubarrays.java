
public class SumOfAllOddLengthSubarrays {
	
	
	public static int sumOddLengthSubarrays(int[] arr) {
	        //int i = arr.length;
	        int sum =0;
	        for(int j=arr.length;j>0;j--) {
	        if(j%2 != 0) {
	        	for(int k=0;k<j;k++) {
	        		sum+=arr[k];
	        	}
	        }
	        
	    }
	       return sum; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(intArray));
	}

}
