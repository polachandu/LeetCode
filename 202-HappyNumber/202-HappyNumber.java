// Last updated: 8/12/2026, 11:16:34 AM
class Solution {
    public boolean isHappy(int n) {
      Set<Integer>set=new HashSet<>();
	        while(true){
	            if(n==1){
	                return true;
	            }
	            else if(set.contains(n)){
	                return false;
	            }
	            set.add(n);
	            n=getSum(String.valueOf(n) );    
	        }
	    }
	    
	    static int getSum(String n){
	        int s=0;
	        for(Character c : n.toCharArray()){
	          s+=Character.getNumericValue(c)*Character.getNumericValue(c);   
	        }
	        return s;
    }
}
