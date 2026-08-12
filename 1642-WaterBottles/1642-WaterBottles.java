// Last updated: 8/12/2026, 11:10:15 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        while(numBottles>=numExchange){
            result += numBottles / numExchange;
            numBottles = numBottles%numExchange + numBottles/numExchange;
        }
        return result;
    }
}