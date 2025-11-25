/**
 * Completed: 2024-02-25
 * Difficulty: Easy
 * 605. Can Place Flowers
 * https://leetcode.com/problems/can-place-flowers/description/
 */

class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if(flowerbed.length == 1) {
            if (flowerbed[0] == 0)
                return true;
            return false;
        }
        if ((flowerbed.length / 2) < n - 1)
            return false;
        int numFlowersPlanted = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1)
                numFlowersPlanted++;
        }
        if (((flowerbed.length - numFlowersPlanted) / 2) < n - 1)
            return false;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else if (i == flowerbed.length - 1) {
                    if (flowerbed[i-1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                } else {
                    if ((flowerbed[i-1] == 0) && (flowerbed[i + 1] == 0)) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        if (n > 0)
            return false;
        return true;
    }
}