// Last updated: 8/12/2026, 11:08:27 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("+")){
                res++;
            }else{
                res--;
            }
        }
    return res;
    }
}