import java.util.HashMap;

/**
 * Completed: 2025-11-12
 * Difficulty: Easy
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/description/
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // PREP
        /*
        * Parameters
        * int[] nums, int target
        * Returns
        * indices of 2 numbers whose sum == target
        * int[x,y]
        * Examples
        * [2, 7, 11, 15], target 9
        * 2 elements in the array whose sum is 9
        * 
        * Pseudocode
        * loop through the array
        * first element 2
        * diff: target - 2 | 9 - 2 | 7
        * [7, 2, 11 15]
        * brute force first
        *
        * loop through each element
        * get the diff number
        * loop through each element again to find the diff
        * if diff DNE, move to next element
        * if diff does exist, return int[i,j]
        *
        *
        * optimized solution:
        *
        * loop through each element
        * get diff number
        * check if diff exists in hashmap
        * if diff exists, return
        * else, add to hashmap
        * 
        */

        // brute force
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = 0; j < nums.length - 1; j++) {
                if (i == j) {
                    j++;
                }
                if (diff == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        // optimized solution
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int diff = target - nums[i];
        //     if (map.get(diff) != null) {
        //         result[0] = i;
        //         result[1] = map.get(diff);
        //         return result;
        //     } else {
        //         map.put(nums[i], i);
        //     }
        // }
        return result;
    }
}