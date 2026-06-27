class Solution {
    public int fib(int n) {
        if(n==0 || n==1)
            return n;
        int n1=0, n2=1, n3=0;
        for(int i=1; i<n; i++){
            n3=n1+n2;
            n1=n2;  
            n2=n3;
        }return n3;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna