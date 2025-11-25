/**
 * Completed: 2024-02-25
 * Difficulty: Easy
 * 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/description/
 */

class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
            j+=2;
        }
        return result;
    }
}