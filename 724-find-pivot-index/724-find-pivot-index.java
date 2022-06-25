class Solution {
    public int pivotIndex(int[] nums) {
        int min = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max += nums[i];
        }
        int j = 0;
        if (j == 0 && min == max) {
            return j;
        }
        while (j < nums.length-1) {
            if (min != max) {
              j++;
              min += nums[j-1];
              max -= nums[j]; 
            }
            else {
                return j;
            }
        }
        if (j == nums.length-1 && min == max) {
            return j;
        }
        return -1;
    }
}