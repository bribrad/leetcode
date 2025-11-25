
/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 2181. Maximum Difference Between Even and Odd Frequencies
 * https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequencies/description/
 */

class FindWordsContainingCharacter {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}