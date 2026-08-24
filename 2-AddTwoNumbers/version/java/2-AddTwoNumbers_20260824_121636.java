// Last updated: 8/24/2026, 12:16:36 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int candidateStart = 0, tank = 0, totalCost = 0, totalGas = 0;
4
5        for (int i = 0; i < gas.length; i++) {
6            totalGas += gas[i];
7            totalCost += cost[i];
8        }
9
10        if (totalCost > totalGas) {
11            return -1;
12        }
13        for (int i = 0; i < gas.length; i++) {
14            tank += gas[i] - cost[i];
15            if (tank < 0) {
16                candidateStart = i + 1;
17                tank = 0;
18            }
19        }
20        return candidateStart;
21    }
22}