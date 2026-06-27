class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int k = 0 ;
        for(int i=0;i<n;i++){
            if(nums[i]%2 ==0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            } 
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna