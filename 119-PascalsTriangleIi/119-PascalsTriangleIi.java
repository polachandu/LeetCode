// Last updated: 8/12/2026, 11:17:54 AM
class Solution {
    int[][] memo;
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        memo = new int[rowIndex + 1][rowIndex + 1];
        
        for (int j = 0; j <= rowIndex; j++) {
            result.add(helper(rowIndex, j));
        }
        
        return result;
    }
    
    public int helper(int i, int j) {
        //HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    	//if (cache.containsKey(j)) {
    	//      return cache.get(j);
    	    //}
         if (memo[i][j] != 0) {
             return memo[i][j];
         }
        
        if (j == 0 || i == j) {
            memo[i][j] = 1;
            return 1;
        }
        
        int result = helper(i - 1, j - 1) + helper(i - 1, j);
        memo[i][j] = result;
        //cache.put(j, result);
        return result;
    }
}
			

