class Solution {
    public String convertToBase7(int num) {

        if (num == 0)
            return "0";

        boolean negative = num < 0;
        num = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (negative)
            sb.append('-');

        return sb.reverse().toString();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna