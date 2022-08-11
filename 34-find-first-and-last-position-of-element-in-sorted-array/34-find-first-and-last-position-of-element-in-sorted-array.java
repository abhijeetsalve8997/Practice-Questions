class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int i = 0;
        int j = nums.length-1;
        int mid = (i+j)/2; // find mid
        while(i<j && nums[mid]!=target){ 
            if(target<nums[mid]){  
                j = mid-1;
            }else{
                i = mid+1;
            }
            
            mid = (i+j)/2;
        }  
        
        // we got the value where the target is at mid
        if(nums[mid]!=target){ // if not then the value was not in array
            return new int[]{-1,-1};
        }
        
        int st = mid;
        //traverse left for starting point
        while(st>0 && nums[st-1] == nums[mid]){
            st--;
        }
        
        
        int en = mid;
        
        // traverse right for ending point
        while(en<nums.length-1 && nums[en+1] == nums[mid]){
            en++;
        }
        
        return new int[]{st,en};
        
    }
}