// Last updated: 8/12/2026, 11:07:34 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFrequency = 0;
        for(int frequency : map.values()){
            maxFrequency = Math.max(maxFrequency,frequency);
        }

        int frequencyOfMaxFrequency = 0;
        for(int frequency : map.values()){
            if(frequency == maxFrequency){
                frequencyOfMaxFrequency++;
            }
        }
        System.gc();
        return frequencyOfMaxFrequency*maxFrequency;
    }
}