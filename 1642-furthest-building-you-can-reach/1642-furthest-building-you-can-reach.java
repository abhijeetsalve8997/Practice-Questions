class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // int k = 0;
        // int count = 0;
        // for (int i = k+1; i < heights.length; i++) {
        //     if (heights[k] >= heights[i]) {
        //         count++;
        //         k++;
        //     }
        //     else if (heights[k] < heights[i] && heights[i] - heights[k] <= bricks) {
        //         bricks -= heights[i] - heights[k];
        //         count++;
        //         k++;
        //     }
        //     else if (heights[k] < heights[i] && heights[i] - heights[k] > bricks && ladders != 0) {
        //         ladders = ladders - 1;
        //         count++;
        //         k++;
        //     }
        // }
        // return count;
        
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 1; i < heights.length; i++){
            if(heights[i] > heights[i - 1]){
                minHeap.add(heights[i] - heights[i - 1]);
                if(minHeap.size() > ladders){
                    bricks -= minHeap.poll();
                    if(bricks < 0)
                        return i - 1;
                }
            }
        }
        return heights.length - 1;
    }
}