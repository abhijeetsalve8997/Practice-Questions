class Solution {
    public int shipWithinDays(int[] weights, int days) {
//         int min_capacity = Integer.MIN_VALUE;
//         int max_capacity = 0;
        
//         for(int i = 0; i < weights.length; i++) {
//             if(weights[i] > min_capacity) min_capacity = weights[i];
            
//             max_capacity += weights[i];
//         }
        
//         int start = min_capacity;
//         int end = max_capacity;
//         int capacity = 0;
        
//         while(start <= end) {
//            int current_capacity = (start + end) / 2;
            
//             if(calculateNoOfDays(current_capacity, weights, days)) {
//                 capacity = current_capacity;
//                 end = current_capacity - 1; 
//             } else start = current_capacity + 1;
//         }
        
//         return capacity;
//     }
    
    
//     public boolean calculateNoOfDays(int mid, int arr[], int D) {
//         int sum = 0;
//         int days = 1;
        
//         for(int i = 0; i < arr.length; i++) {
//             if(sum + arr[i] <= mid) sum += arr[i];
//             else {
//                 sum = arr[i];
//                 days++;
//             }
//         }
        
//         if(days <= D) {
//             return true;
//         }
//         return false;
        
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < weights.length; i++) {
            if(max < weights[i]) max = weights[i];
            
            sum += weights[i];
        }
        
        int lo = max;
        int hi = sum;
        int ans = 0;
        
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if(fun(mid, weights, days)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    
            public boolean fun (int mid, int arr[], int D) {
            int days = 1;
            int sum = 0;
            
            for(int i = 0; i < arr.length; i++) {
                if(sum + arr[i] <= mid) sum += arr[i];
                else {
                    sum = arr[i];
                    days++;
                }     
            }
            
            if(days <= D) return true;
            else return false;
        }
}