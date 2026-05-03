class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: length check
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: check substring in s+s
        String combined = s + s;

        return combined.contains(goal);
    }
}