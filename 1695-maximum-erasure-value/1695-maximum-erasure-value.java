class Solution {
     public int maximumUniqueSubarray(int[] nums) {
        int l =0, r = 0, length = nums.length, sum = 0;
        int[] map = new int[10001];
        int ans = 0;
        while (r < length) {
            map[nums[r]]++;
            sum += nums[r];
            r++;
            while (map[nums[r - 1]] >= 2) {
                map[nums[l]]--;
                sum -= nums[l];
                l++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}