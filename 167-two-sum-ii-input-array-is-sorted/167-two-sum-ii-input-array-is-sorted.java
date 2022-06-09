class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
     // APPROACH 01: TWO POINTER METHOD
            
        int start = 0;
        int end = numbers.length-1;
        
        while (numbers[start]+numbers[end] != target) {
            if (numbers[start]+numbers[end] > target) {
                end--;
            }
            else {
                start++;
            }
        }
        return new int[] {start+1, end+1};
        
//     // APPROACH 02 USING HASHMAP METHOD
        
//         HashMap <Integer,Integer> map = new HashMap<>();
//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i];
//             int compl = target - curr;
//             if (map.containsKey(compl)) {
//                 return new int[] {map.get(compl)+1,i+1};
//             }
//             else {
//                 map.put(numbers[i],i);
//             }
//         }
//         return null;
    }
}