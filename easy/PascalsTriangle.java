/**
 * Completed: 2023-11-05
 * Difficulty: Easy
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/description/
 */

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<Integer>();
            if (n == 0) {
                row.add(1);
            } else {
                List<Integer> prevRow = result.get(n-1);
                
                int i = 0;
                while (i < n) {
                    if (i == 0) {
                        row.add(1);
                    } else {
                        row.add((prevRow.get(i - 1) + prevRow.get(i)));
                    }
                    i++;
                }
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}