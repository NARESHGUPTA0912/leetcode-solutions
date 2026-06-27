// class Solution {
//     public int scoreOfString(String s) {
//         int sum=0;
//         for(int i=0; i<s.length()-1; i++) {
//             sum = sum + Math.abs(s.charAt(i) - s.charAt(i+1));
//         }
//         return sum;
//     }
// }

class Solution {
    int score(String s,int i){
        if(i==0)return 0;
        return Math.abs(s.charAt(i)-s.charAt(i-1))+score(s,i-1);
    }
    public int scoreOfString(String s) {
        return score(s,s.length()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna