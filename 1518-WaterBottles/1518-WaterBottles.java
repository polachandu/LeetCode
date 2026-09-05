// Last updated: 9/5/2026, 12:30:24 PM
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