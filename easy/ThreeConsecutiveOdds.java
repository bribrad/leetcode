/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 1550. Three Consecutive Odds
 * https://leetcode.com/problems/three-consecutive-odds/description/
 */

class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int numOddsInARow = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                numOddsInARow++;
            } else {
                numOddsInARow = 0;
            }
            if (numOddsInARow == 3)
                return true;
        }
        return false;
        
    }
}