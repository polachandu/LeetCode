//Given an integer n, return any array containing n unique integers such that they add up to 0.
//Example 1:
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

//Example 2:
//Input: n = 3
//Output: [-1,0,1]

//Example 3:
//Input: n = 1
//Output: [0]
		
import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
	public static int[] sumZero(int n) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(sumZero(5)));
		System.out.println(Arrays.toString(sumZero(2)));
	}

}
