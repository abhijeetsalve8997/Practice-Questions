class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length - 1) / 2;
        int i = 0;
        int count = 0;
        while (i < nums.length) {
            if (i < mid) {
                count += (nums[mid] - nums[i]);
            }
            else {
                count += (nums[i] - nums[mid]);
            }
                i++;
        }
        return count;
    }
}