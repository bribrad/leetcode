
/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 1394. Find Lucky Number in an Array
 * https://leetcode.com/problems/find-lucky-number-in-an-array/description/
 */

class FindLuckyNumberInAnArray {
    public int findLucky(int[] arr) {
         HashMap<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frequencies.get(arr[i]) == null) {
                int num = arr[i];
                int count = 0;
                for (int j = i; j < arr.length; j++) {
                    if (num == arr[j]) {
                        count++;
                    }
                }

                frequencies.put(arr[i], count);
            }
        }

        int maxLucky = -1;

        for (Integer num : frequencies.keySet()) {
            int freq =  frequencies.get(num);
            if (freq == num && num > maxLucky) {
                maxLucky = num;
            }
        }

        return maxLucky;
    }
}