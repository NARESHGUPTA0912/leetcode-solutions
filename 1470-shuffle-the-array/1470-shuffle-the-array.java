class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                // Even positions get elements from the first half
                ans[i] = nums[i / 2];
            } else {
                // Odd positions get elements from the second half (starting at index n)
                ans[i] = nums[n + (i / 2)];
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna