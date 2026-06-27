// class Solution {
//     public int[] buildArray(int[] nums) {
//         int[] ans = new int[nums.length];
//         for (int i=0; i<nums.length; i++) {
//             ans[i] = nums[nums[i]];
//         } return ans;
//     }
// }

class Solution {
    public int[] buildArray(int[] nums) {
        perm(nums,0);
        return nums;
    }
    private  void perm(int[] ans, int start){
        if(start>ans.length-1) return;
        int temp = ans[ans[start]];
        perm(ans,start+1);
        ans[start]= temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna