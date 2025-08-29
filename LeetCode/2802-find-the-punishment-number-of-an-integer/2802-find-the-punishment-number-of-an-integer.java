class Solution {
    public int punishmentNumber(int n) {
        int punishNum = 0;
        for(int currentNum = 1;currentNum<=n;currentNum++){
            int squareNum = currentNum*currentNum;
            if(canPartition(squareNum, currentNum)){
                punishNum+=squareNum;
            } 
        }
        return punishNum;
    }

    private boolean canPartition(int num, int target){
        if(target < 0 || num < target){
            return false;
        }
        if(num == target){
            return true;
        }

        return(canPartition(num/10,target - (num%10)) ||
        canPartition(num/100,target-(num%100)) ||
        canPartition(num/1000,target-(num%1000)));
    }
}