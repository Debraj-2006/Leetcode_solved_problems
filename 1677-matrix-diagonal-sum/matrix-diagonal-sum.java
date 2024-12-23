public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];

            // Add secondary diagonal element, if not the same as primary diagonal element
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }

        return sum;
    }

}
