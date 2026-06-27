class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        if(operations.length == 0)
            return -1;
        for(String s: operations){
            if (s.equals("++X")){
                ++res;
            }
            else if (s.equals("X++")){
                res++;
            }
            else if (s.equals("X--")){
                res--;
            }
            else if (s.equals("--X")){
                --res;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna