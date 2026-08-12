// Last updated: 8/12/2026, 11:17:37 AM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        } 
        for(int i: nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}