/**
 * Completed: 2025-05-09
 * Difficulty: Easy
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 */

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String curWord = strs[i];
            int endPointer = prefix.length() - 1;
            boolean prefixMatch = false;
            if (prefix.length() > curWord.length()) {
                prefix = prefix.substring(0, curWord.length());
            }
            while (!prefixMatch && endPointer >= 0) {
                if (curWord.substring(0, prefix.length()).equals(prefix)) {
                    prefixMatch = true;
                } else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
                endPointer--;
            };
        }
        return prefix;
    }
}