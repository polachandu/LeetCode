// Last updated: 8/12/2026, 11:17:39 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas = 0, totalGas = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }
        if (totalGas >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}