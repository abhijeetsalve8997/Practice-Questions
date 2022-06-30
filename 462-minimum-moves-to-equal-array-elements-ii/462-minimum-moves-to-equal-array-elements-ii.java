class Solution {
    public int minMoves2(int[] nums) {
        int mid = (nums.length-1)/2;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
                if (i < mid) {
                    count += (nums[mid]-nums[i]);
                } else {
                    count += (nums[i]-nums[mid]);
                }
        }
        return count;
    }
}