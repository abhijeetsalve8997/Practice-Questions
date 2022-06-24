class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // APPROACH 01: BY USING ARRAY'S SORT METHOD (T.C = nLogn)
        // int k = 0;
        // for (int i = m; i < nums1.length; i++) {
        //     nums1[i] = nums2[k];
        //     k++;
        // }
        // Arrays.sort(nums1);
        
        // APPROACH 02: USING POINTERS
        int insertPointer = nums1.length - 1;
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[insertPointer] = nums1[nums1Pointer];
                nums1Pointer--;
                insertPointer--;
            }
            else {
                nums1[insertPointer] = nums2[nums2Pointer];
                nums2Pointer--;
                insertPointer--;
            }
        }
        while (nums2Pointer >= 0) {
            nums1[insertPointer] = nums2[nums2Pointer];
            nums2Pointer--;
            insertPointer--;
        }
    }
}
























// Time Complexity: O(n);

// Space Complexity: O(1);

// Explaination: Firsty, i have stored all the elements from nums2 array to nums1 array by applying loop from m (i.e. no. of elements present in array nums1) to nums.length(size of nums1 array). After that all the remaining elements of nums1 are stored in their respective place by another loop. Now all the elements are merged in array nums1 only the sorting is remaining. For that i have used wrapper class sort method and done with example!