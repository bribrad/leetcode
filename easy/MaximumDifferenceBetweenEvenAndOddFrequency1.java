/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 2181. Maximum Difference Between Even and Odd Frequencies
 * https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequencies/description/
 */

class MaximumDifferenceBetweenEvenAndOddFrequency1 {
    public int maxDifference(String s) {
        int maxOdd = 0;
        int minEven = 100;

        HashMap<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (frequencies.get(s.charAt(i)) == null) {
                Character c = s.charAt(i);
                int count = 0;
                for (int j = i; j < s.length(); j++) {
                    if (c == s.charAt(j)) {
                        count++;
                    }
                }

                frequencies.put(s.charAt(i), count);
                if (count % 2 == 0 && count <= minEven) {
                    minEven = count;
                } else if (count % 2 != 0 && count > maxOdd) {
                    maxOdd = count;
                }
            }
        }

        return maxOdd - minEven;
        
    }
}