// Last updated: 9/5/2026, 12:29:44 PM
class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int monday = 1;
        while(n > 0){
            for(int day =0;day < Math.min(n,7);day++){
                sum += monday+day;
            }
            n-=7;
            monday++;
        }
    return sum;
    }
}