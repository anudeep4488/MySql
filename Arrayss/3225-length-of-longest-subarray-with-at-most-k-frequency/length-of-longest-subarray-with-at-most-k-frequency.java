class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < nums.length; right++) {

            // add current element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // shrink if invalid
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            // update answer
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}