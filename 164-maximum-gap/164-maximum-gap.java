class Solution {
    public int maximumGap(int[] nums) {
//         if (nums.length < 1) {
//             return 0;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length-1-i; j++) {
//                 if (nums[j] > nums[j+1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j+1];
//                     nums[j+1] = temp;
//                 }
//             }
//         }
//         int max_diff = 0;
//         int j = 0;
//         for (int i = j+1; i < nums.length; i++) {
            
//             if (nums[i] - nums[j] > max_diff) {
//                 max_diff = nums[i] - nums[j];
//             }
//             j++;
//         }
//         return max_diff;
        Arrays.sort(nums);
        if (nums.length < 1) {
            return 0;
        }
        int max_diff = 0;
        int curr_diff = 0;
        int j = 0;
        for (int i = j+1; i < nums.length; i++) {
            curr_diff = nums[i] - nums[j];
            if (curr_diff > max_diff && nums[i] > nums[j]) {
                max_diff = curr_diff;
            }
            j++;
        }
        return max_diff;
    }
}