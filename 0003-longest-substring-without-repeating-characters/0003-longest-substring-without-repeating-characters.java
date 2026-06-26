class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];

        Arrays.fill(index,-1);
        // for(int i=0; i<128; i++)
            // index[i] = -1;
        int left = 0, maxLength = 0;
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            if(index[c] >= left)
                left = index[c]+1;
            index[c] = right;
            int tempLength = right-left+1;
            if(tempLength > maxLength)
                maxLength = tempLength;
        }
        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna