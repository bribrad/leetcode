/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 2894. Divisible and Non-divisible Sums Difference
 * https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
 */

class DivisibleAndNonDivisibleSumsDifference {
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