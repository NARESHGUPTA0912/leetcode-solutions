class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int[] j : accounts){
            int total = 0;
            for(int i : j){
                total += i;
                if(total > wealth){
                    wealth = total;
                } 
            }
        }
        return wealth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna