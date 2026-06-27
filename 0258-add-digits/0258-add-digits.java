class Solution {

    //using recursion
    public int addDigits(int num) {
    //     if (num == 0)
    //         return 0;
    //     return 1 + (num - 1) % 9;
    // }

    //using loop
        while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
        }
    return num;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna