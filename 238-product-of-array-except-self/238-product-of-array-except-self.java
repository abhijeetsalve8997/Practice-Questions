class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int len = nums.length;
//         int[] leftProduct = new int [len];
//         int[] rightProduct = new int [len];
//         int[] result = new int [len];
        
//         leftProduct[0] = 1;
//         rightProduct[len - 1] = 1;
        
//         for (int i = 1; i < len; i++) {
//             leftProduct[i] = nums[i-1] * leftProduct[i - 1];
//         }
        
//         for (int i = len - 2; i >= 0; i--) {
//             rightProduct[i] = nums[i+1] * rightProduct[i + 1];
//         }
        
//         for (int i = 0; i < len; i++) {
//             result[i] = leftProduct[i] * rightProduct[i];
//         }
//         return result;
        
        
        int len = nums.length;
        int[] result = new int [len];
        
        result[0] = 1;
        int R = 1;
        
        for (int i = 1; i < len; i++) {
            result[i] = nums[i-1] * result[i - 1];
        }
        
        for (int i = len - 1; i >= 0; i--) {
            result[i] = result[i] * R;
            R = R * nums[i];
        } 
        return result;
    }
}