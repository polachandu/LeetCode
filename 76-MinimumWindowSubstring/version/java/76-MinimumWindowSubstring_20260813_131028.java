// Last updated: 8/13/2026, 1:10:28 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] result = new int[nums1.length + nums2.length];
4        int nums1Tracker = 0, nums2Tracker = 0;
5        int i = 0;
6        while (i < result.length && nums1Tracker < nums1.length && nums2Tracker < nums2.length) {
7
8            if (nums1[nums1Tracker] < nums2[nums2Tracker]) {
9                result[i] = nums1[nums1Tracker];
10                nums1Tracker++;
11            } else {
12                result[i] = nums2[nums2Tracker];
13                nums2Tracker++;
14            }
15            i++;
16        }
17
18        while (i < result.length && nums2Tracker >= nums2.length) {
19            result[i] = nums1[nums1Tracker];
20            i++;
21            nums1Tracker++;
22        }
23
24        while (i < result.length && nums1Tracker >= nums1.length) {
25            result[i] = nums2[nums2Tracker];
26            i++;
27            nums2Tracker++;
28        }
29        int resultLen = result.length;
30        if (resultLen % 2 == 0) {
31            return ((double) (result[resultLen / 2] + result[(resultLen / 2) - 1]) / 2);
32        } else {
33            return (double) (result[resultLen / 2]);
34        }
35    }
36}