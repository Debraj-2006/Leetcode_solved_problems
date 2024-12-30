import java.util.PriorityQueue;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int answer = 0;

        // Initialize a priority queue for each row to maintain the greatest elements
        PriorityQueue<Integer>[] maxHeaps = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            maxHeaps[i] = new PriorityQueue<>((a, b) -> b - a); // Max-Heap
            for (int j = 0; j < n; j++) {
                maxHeaps[i].offer(grid[i][j]);
            }
        }

        // Iterate until the matrix becomes empty
        for (int col = 0; col < n; col++) {
            int currentMax = Integer.MIN_VALUE;
            // Delete the greatest value from each row and find the maximum of these values
            for (int i = 0; i < m; i++) {
                if (!maxHeaps[i].isEmpty()) {
                    int value = maxHeaps[i].poll(); // Remove the greatest value from the row
                    currentMax = Math.max(currentMax, value);
                }
            }
            answer += currentMax; // Add the maximum value to the answer
        }

        return answer;
    }

   
}
