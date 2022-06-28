class Solution {
    public int minDeletions(String s) {
        int[] freq = new int [26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        Set<Integer> occupiedFreq = new HashSet<>();
        int deletion = 0;
        
        for (int i = 0; i < 26; i++) {
            int currFreq = freq[i];
            while (currFreq > 0) {
                if (occupiedFreq.contains(currFreq)) {
                    currFreq--;
                    deletion++;
                }
                else {
                    break;
                }
            }
            if (currFreq != 0) {
                occupiedFreq.add(currFreq);
            }
        }
        return deletion;
    }
}