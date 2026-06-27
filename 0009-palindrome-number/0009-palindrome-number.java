class Solution {
    public boolean isPalindrome(int x) {
        // We revert half of the number and compare with the original number
        // edge cases, 0/1/negative numbers
        if (x < 0)
            return false;
        if (x % 10 == 0 && x != 0)
            return false;
        int revert = 0;
        while (x > revert) {
            revert = revert*10 + x%10;
            x/=10;
        }
        return x == revert || x == revert/10; 
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna