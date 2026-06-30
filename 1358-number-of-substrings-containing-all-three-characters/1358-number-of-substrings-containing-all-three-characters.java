// class Solution {

//     public int numberOfSubstrings(String s) {
//         int len = s.length();
//         int left = 0, right = 0;
//         // Track frequency of a, b, c
//         int[] freq = new int[3];
//         int total = 0;

//         while (right < len) {
//             // Add character at right pointer to frequency array
//             char curr = s.charAt(right);
//             freq[curr - 'a']++;

//             // While we have all required characters
//             while (hasAllChars(freq)) {
//                 // All substrings from current window to end are valid
//                 // Add count of these substrings to result
//                 total += len - right;

//                 // Remove leftmost character and move left pointer
//                 char leftChar = s.charAt(left);
//                 freq[leftChar - 'a']--;
//                 left++;
//             }
//             right++;
//         }
//         return total;
//     }
//     private boolean hasAllChars(int[] freq) {
//         // Check if we have at least one of each character
//         return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
//     }
// }

class Solution {
    public int numberOfSubstrings(String s) {
        char[] ch = s.toCharArray();
        int[] abc = new int[3];
        for(int i = 0; i < abc.length; i++){
            abc[i] = -1;
        }
        int count = 0, right = 0;
        while(right < ch.length){
            abc[ch[right] - 'a'] = right;
            int minIndex = Integer.MAX_VALUE;
            for(int i = 0; i < 3; i++)
                minIndex = Math.min(minIndex, abc[i]);
            count += (minIndex + 1);
            right++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna