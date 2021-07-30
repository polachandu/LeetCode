import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PascalsTriangleII {
// 	HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
//	public static long factorial(int n) {
//		
//		if(n==0) {
//			return 1;
//			
//		}
//		return factorial(n-1)*n;
//	}
//	public static List<Integer> getRow(int rowIndex) {
//			List<Integer> list = new ArrayList<Integer>();
//        	for(int j=0;j<=rowIndex;j++) {
//        		long a = (factorial(rowIndex)/(factorial(rowIndex-j)*factorial(j)));
//        		
//        		list.add((int) a);
//        	}
//		return list;
//    }
	static int[][] memo;
    public static List<Integer> getRow(int rowIndex) {
    	
        List<Integer> result = new ArrayList<>();
        memo = new int[rowIndex + 1][rowIndex + 1];
        
        for (int j = 0; j <= rowIndex; j++) {
            result.add(helper(rowIndex, j));
        }
        
        return result;
    }
    
    public static int helper(int i, int j) {
//        if (memo[i][j] != 0) {
//            return memo[i][j];
//        }
    	HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    	if (cache.containsKey(j)) {
    	      return cache.get(j);
    	    }
        
        if (j == 0 || i == j) {
            memo[i][j] = 1;
            return 1;
        }
        
        int result = helper(i - 1, j - 1) + helper(i - 1, j);
        memo[i][j] = result;
       // cache.put(j, result);
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getRow(3));
		//System.out.println(getRow(1));
		//System.out.println(getRow(0));
		System.out.println(getRow(13));
		System.out.println(getRow(28));

		
		
	}

}
