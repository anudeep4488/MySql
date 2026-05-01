class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        
        // Step 1: Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        // Step 2: Find max frequency
        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        
        // Step 3: Find last occurrence of each char
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Step 4: Traverse from end and pick chars with max freq
        boolean[] added = new boolean[26];
        StringBuilder res = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            
            if (!added[idx] && freq[idx] == maxFreq) {
                res.append(ch);
                added[idx] = true;
            }
        }
        
        // reverse because we collected from end
        return res.reverse().toString();
    }
}