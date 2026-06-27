class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // Add elements from primary diagonal.
            ans += mat[i][i];
            // Add elements from secondary diagonal.
            ans += mat[n - 1 - i][i];
        }
        // If n is odd, subtract the middle element as its added twice.
        if (n % 2 != 0) {
            ans -= mat[n / 2][n / 2];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna