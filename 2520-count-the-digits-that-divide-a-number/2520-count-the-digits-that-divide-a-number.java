class Solution {
    public int countDigits(int num) {
        int org_num = num, count = 0;
        while (num > 0) {
            int digit = num % 10;

            if (digit != 0 && org_num % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna