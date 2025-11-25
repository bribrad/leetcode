/**
 * Completed: 2023-11-05
 * Difficulty: Easy
 * 119. Pascal's Triangle II
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 */

class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<Integer>();
        if (rowIndex == 0) {
            row.add(1);
            return row;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int n = 0; n <= rowIndex; n++) {
            row = new ArrayList<Integer>();
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
        return row;
    }
}