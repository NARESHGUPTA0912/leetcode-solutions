// class Solution {
//     public int thirdMax(int[] nums) {
//         Long first = null;
//         Long second = null;
//         Long third = null;

//         for (int n : nums) {
//             if (first != null && n == first ||
//                 second != null && n == second ||
//                 third != null && n == third) {
//                 continue; // skip duplicates
//             }

//             if (first == null || n > first) {
//                 third = second;
//                 second = first;
//                 first = (long) n;
//             } else if (second == null || n > second) {
//                 third = second;
//                 second = (long) n;
//             } else if (third == null || n > third) {
//                 third = (long) n;
//             }
//         }
//         return third == null ? first.intValue() : third.intValue();
//     }
// }


class Solution {
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
        for(int val:nums){
            if(val>max1){
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(val>max2 && val!=max1){
                max3=max2;
                max2=val;
            }
            else if(val>max3 && val!=max1 && val!=max2){
                max3=val;
            }
        }
      if(max3==Long.MIN_VALUE){
        return (int) max1;
      }
      return (int)max3;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna