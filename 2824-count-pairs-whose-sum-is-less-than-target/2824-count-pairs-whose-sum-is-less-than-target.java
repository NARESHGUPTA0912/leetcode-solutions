class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count =0;
        int length = nums.size()-1;
        for(int i=0;i<=length-1;i++){
           int a= nums.get(i);
           for(int j=i+1;j<=length;j++){
                int b= nums.get(j);
                if(a+b<target){
                    count++;
                }
           }
        
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna