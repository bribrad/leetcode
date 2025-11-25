/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 1920. Build Array from Permutation
 * https://leetcode.com/problems/build-array-from-permutation/description/
 */

class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}