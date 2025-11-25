/**
 * Completed: 2025-09-30
 * Difficulty: Easy
 * 221. Type of Triangle
 * https://leetcode.com/problems/type-of-triangle/description/
 */

class TypeOfTriangle {
    public String triangleType(int[] nums) {

        int sideLengthA = nums[0];
        int sideLengthB = nums[1];
        int sideLengthC = nums[2];
        if (sideLengthA + sideLengthB <= sideLengthC || sideLengthB + sideLengthC <= sideLengthA || sideLengthA + sideLengthC <= sideLengthB)
            return "none";
        

        boolean aBMatch = (nums[0] == nums[1]);
        boolean aCMatch = (nums[0] == nums[2]);
        boolean bCMatch = (nums[1] == nums[2]);

        if (aBMatch && aCMatch)
            return "equilateral"; 

        if (aBMatch || aCMatch || bCMatch)
            return "isosceles";
        return "scalene";
    }
}