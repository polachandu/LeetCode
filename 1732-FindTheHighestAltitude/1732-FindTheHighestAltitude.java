// Last updated: 9/5/2026, 12:29:37 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int[] newGain = new int[gain.length+1];
        newGain[0] = 0;
        for(int i=1;i<gain.length+1;i++){
            newGain[i] = newGain[i-1]+ (gain[i-1]);
        }
        Arrays.sort(newGain);
        return newGain[gain.length];
    }
}