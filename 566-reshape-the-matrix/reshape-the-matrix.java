public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape operation is possible
        if (m * n != r * c) {
            return mat; // Return the original matrix
        }

        int[][] reshapedMatrix = new int[r][c];
        int row = 0, col = 0;

        // Fill the reshaped matrix with elements from the original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMatrix[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return reshapedMatrix;
    }
}
