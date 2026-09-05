// Last updated: 9/5/2026, 12:28:16 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minCost = prices[0]+prices[1];
        if(minCost <= money){
            return money - minCost;
        }else{
            return money;
        }
    }
}