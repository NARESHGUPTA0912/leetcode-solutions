class Solution {
    public int subtractProductAndSum(int n) {
        int product=1, sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }return product-sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna