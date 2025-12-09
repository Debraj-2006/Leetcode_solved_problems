class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store last index of each character (ASCII)
        int[] lastIndex = new int[128];
        // Initialize all to -1 (character not seen yet)
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int maxLen = 0;
        int left = 0;  // left pointer of window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character seen and inside current window, move left
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }

            // Update last seen index of current char
            lastIndex[c] = right;

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
