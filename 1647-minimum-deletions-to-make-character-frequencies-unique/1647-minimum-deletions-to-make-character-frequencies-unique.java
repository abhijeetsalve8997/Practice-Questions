class Solution {
    public int minDeletions(String s) {
        int[] freq = new int [26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        Set <Integer> occurances = new HashSet<>();
        int deletionRequired = 0;
        
        for (int i = 0; i < 26; i++) {
            int currFreq = freq[i];
            while (currFreq > 0) {
                if (occurances.contains(currFreq)) {
                    currFreq--;
                    deletionRequired++;
                }
                else {
                    break;
                }
            }
            if (currFreq != 0) {
                occurances.add(currFreq);
            }
        }
        return deletionRequired;
    }
}