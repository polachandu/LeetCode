// Last updated: 9/5/2026, 12:27:55 PM
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