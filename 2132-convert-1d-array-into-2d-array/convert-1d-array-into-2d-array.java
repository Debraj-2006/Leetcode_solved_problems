public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if it's possible to create the 2D array
        if (original.length != m * n) {
            return new int[0][0]; // Return an empty 2D array
        }

        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }

        return result;
    }

}
