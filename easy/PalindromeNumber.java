/**
 * Completed: 2025-05-04
 * Difficulty: Easy
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 */

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        String num = String.valueOf(x);
        int start = 0;
        int end = num.length() - 1;
        while (start < end) {
            if (num.charAt(start) != num.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}