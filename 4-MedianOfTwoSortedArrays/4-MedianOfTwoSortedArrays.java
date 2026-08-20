// Last updated: 8/20/2026, 4:17:12 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int nums1Tracker = 0, nums2Tracker = 0;
        int i = 0;
        while (i < result.length && nums1Tracker < nums1.length && nums2Tracker < nums2.length) {

            if (nums1[nums1Tracker] < nums2[nums2Tracker]) {
                result[i] = nums1[nums1Tracker];
                nums1Tracker++;
            } else {
                result[i] = nums2[nums2Tracker];
                nums2Tracker++;
            }
            i++;
        }

        while (i < result.length && nums2Tracker >= nums2.length) {
            result[i] = nums1[nums1Tracker];
            i++;
            nums1Tracker++;
        }

        while (i < result.length && nums1Tracker >= nums1.length) {
            result[i] = nums2[nums2Tracker];
            i++;
            nums2Tracker++;
        }
        int resultLen = result.length;
        if (resultLen % 2 == 0) {
            return ((double) (result[resultLen / 2] + result[(resultLen / 2) - 1]) / 2);
        } else {
            return (double) (result[resultLen / 2]);
        }
    }
}