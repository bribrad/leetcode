
/**
 * Completed: 2024-03-19
 * Difficulty: Easy
 * 409. Longest Palindrome
 * https://leetcode.com/problems/longest-palindrome/description/
 */

class LongestPalindrome {
    public int longestPalindrome(String s) {
        // to construct the length of the longest possible palindrome, we need to 
        // subtract the number of unique characters from the length of the total string.

        // abccccdd 8
        // dccaccd 7 b 1
        // dccbccd 7 a 1
        // aaabccccdd 11
        // dccaaaccd 9 b 1
        // aaabccccddefg 13
        // dccaaaccd 9 b 1 e 1 f 1 g 1
        // check unique characters & characters occuring an odd # of times.
        // use the character with the most odd occurrences for the palindrome,
        // and truncate all other unique occurrences

        int length = 0;
        Set<Character> charSet = new HashSet<>();

        for (char currentChar : s.toCharArray()) {
            if (charSet.contains(currentChar)) {
                length += 2;
                charSet.remove(currentChar);
            } else {
                charSet.add(currentChar);
            }
        }
        if (!charSet.isEmpty()) {
            length++;
        }
        return length;
    }
}