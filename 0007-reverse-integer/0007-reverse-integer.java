// class Solution {
//     public int reverse(int x) {
//         long reversed = 0;

//         while (x != 0) {
//             reversed = reversed * 10 + x % 10;
//             x /= 10;
//             if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
//                 return 0; // overflow
//             }
//         }

//         return (int) reversed;
//     }
// }

class Solution {
    public int reverse(int x) {
    int reverse = 0;
    while(x!=0){
        int lastDigit = x%10;
        if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10)
            return 0;
        reverse = reverse*10 + lastDigit;
        x = x/10;
    }
    return reverse;
    }        
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna