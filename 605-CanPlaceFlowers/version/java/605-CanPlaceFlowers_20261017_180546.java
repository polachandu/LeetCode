// Last updated: 10/17/2026, 6:05:46 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        for (int i = 0; i < flowerbed.length; i++) {
4            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
5                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
6                flowerbed[i] = 1;
7                n--;
8            }
9        }
10        if (n <= 0) {
11            return true;
12        } else {
13            return false;
14        }
15    }
16}