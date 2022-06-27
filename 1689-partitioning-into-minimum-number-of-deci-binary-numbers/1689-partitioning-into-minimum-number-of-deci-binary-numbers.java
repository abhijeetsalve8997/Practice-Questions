class Solution {
    public int minPartitions(String n) {
        int result = 0;
        for (char i : n.toCharArray()) {
           result = Math.max(result, i - '0'); 
        }
        return result;
    }
}