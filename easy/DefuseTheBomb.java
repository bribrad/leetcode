
/**
 * Completed: 2023-11-05
 * Difficulty: Easy
 * 1652. Defuse the Bomb
 * https://leetcode.com/problems/defuse-the-bomb/description/
 */

class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            if (k > 0) {
                result[i] = getSum(true, code, i + 1, k);
            } else if (k < 0){
                result[i] = getSum(false, code, i - 1, k * -1);
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    int getSum(boolean next, int[] code, int index, int count) {
        int sum = 0;
        int circularIndex = 0;
        if (next) {
            for (int i = 0; i < count; i++) {
                circularIndex = index + i;
                if (circularIndex >= code.length) {
                    circularIndex = circularIndex % code.length;
                }
                sum += code[circularIndex];
            }
        } else {
            for (int i = 0; i < count; i++) {
                circularIndex = index - i;
                if (circularIndex < 0) {
                    circularIndex = (code.length) + (circularIndex % code.length);
                }
                sum += code[circularIndex];
            }
        }
        return sum;
    }
}