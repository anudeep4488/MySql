class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long count = 0;
        long zeros = 0;

        for (int num : nums) {

            if (num == 0) {
                zeros++;          // extend streak
                count += zeros;   // add new subarrays
            } else {
                zeros = 0;        // reset
            }
        }

        return count;
    }
}