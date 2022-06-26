class Solution {
    public int[] sortedSquares(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
        int posPointer = 0;
        while (posPointer < nums.length && nums[posPointer] < 0) {
            posPointer++;
        }
        int negPointer = posPointer - 1;
        int[] sqr = new int [nums.length];
        int k = 0;
        while (negPointer >= 0 && posPointer < nums.length) {
            if (nums[negPointer]*nums[negPointer] < nums[posPointer]*nums[posPointer]) {
                sqr[k] = nums[negPointer]*nums[negPointer];
                negPointer--;
            }
            else {
                sqr[k] = nums[posPointer]*nums[posPointer];
                posPointer++;
            }
            k++;
        }
        while (negPointer >= 0) {
            sqr[k] = nums[negPointer]*nums[negPointer];
            negPointer--;
            k++;
        }
        while (posPointer < nums.length) {
            sqr[k] = nums[posPointer]*nums[posPointer];
            posPointer++;
            k++;
        }
        return sqr;
    }
}