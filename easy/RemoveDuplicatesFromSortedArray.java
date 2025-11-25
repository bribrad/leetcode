import java.util.ArrayList;

/**
 * Completed: 2025-11-16
 * Difficulty: Easy
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> numSet = new ArrayList<>();
        int nextIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(nums[i])) {
                numSet.add(nums[i]);
                nums[nextIndex] = nums[i];
            } else {
                nextIndex++;
            }
        }
        
        return numSet.size();        
    }
}