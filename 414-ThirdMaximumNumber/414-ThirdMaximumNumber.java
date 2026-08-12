// Last updated: 8/12/2026, 11:14:49 AM
class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
			al.add(nums[i]);
		}
		Set set = new HashSet<>(al);
		al.clear();
		al.addAll(set);

		 if(al.size()<3){
	            int m=Integer.MIN_VALUE;
	            for(int i=0;i<al.size();i++){
	                if(al.get(i)>m){
	                    m=al.get(i);
	                }
	            }return m;
	        }
		int f=0;
		for(int i=0;i<al.size();i++) {
			if (al.get(i)>f ) {
	            f = al.get(i);}
		}
		
		int s=al.get(0);
	    for (int i=0;i<al.size();i++) {
	        if (al.get(i)>s&&al.get(i)< f) {
	            s = al.get(i);}
	    }
	    
	    int t=al.get(0);
	    for (int i=0;i<al.size();i++) {
	        if (al.get(i)>t&&al.get(i)< s) {
	            t =al.get(i);}
	    }
        return t;
    }
}