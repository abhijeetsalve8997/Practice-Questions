class Solution {
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}

// Time Complexity: O(n);

// Space Complexity: O(n);

// Explaination: In this question, firstly a new array 'cumulative[]' is declared so that all cumulative sum is stored in that array with respective its corresponding index and then it is achieved by using while loop and finally that array is returned!