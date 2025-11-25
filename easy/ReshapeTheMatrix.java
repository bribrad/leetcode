/**
 * Completed: 2024-02-25
 * Difficulty: Easy
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/description/
 */

class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        if ((numRows * numCols) != (r * c)) {
            return mat;
        }
        int[][] result = new int[r][c];
        int x = 0;
        int y = 0;
        for (int i = 0; i < (numRows * numCols); i++) {
            result[x][y] = mat[i / numCols][i % numCols];
            y++;
            if (y % c == 0) {
                    y = 0;
                    x++;
            }
        }
        return result;
    }
}