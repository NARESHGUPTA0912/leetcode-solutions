// class Solution {

//     public int numOfStrings(String[] patterns, String word) {
//         int res = 0;
//         for (String pattern : patterns) {
//             if (check(pattern, word)) {
//                 res++;
//             }
//         }
//         return res;
//     }

//     private boolean check(String pattern, String word) {
//         int m = pattern.length();
//         int n = word.length();
//         for (int i = 0; i + m <= n; i++) {
//             boolean flag = true;
//             for (int j = 0; j < m; j++) {
//                 if (word.charAt(i + j) != pattern.charAt(j)) {
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(word.contains(patterns[i]))
            {
                count++;
            }
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna