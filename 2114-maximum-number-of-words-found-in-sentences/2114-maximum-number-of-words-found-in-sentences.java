class Solution {
    public int mostWordsFound(String[] sentences) {
        int total = 0;
        for (String s : sentences){
            int space = 1;
            for (char c : s.toCharArray()){
                if(c == ' '){
                    space += 1;
                }
            }
            if(space > total){
                total = space;
            }
        }
        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna