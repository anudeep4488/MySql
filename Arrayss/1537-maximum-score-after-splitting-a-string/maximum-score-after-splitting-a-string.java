class Solution {
    	public int maxScore(String s) {

    int zeros = 0;
    int ones = 0;
    int maxDiff = Integer.MIN_VALUE;

    for (int i = 0; i < s.length() - 1; i++) {

        if (s.charAt(i) == '0') {
            zeros++;
        } else {
            ones++;
        }

        maxDiff = Math.max(maxDiff, zeros - ones);
    }

    // add last character if it's '1'
    if (s.charAt(s.length() - 1) == '1') {
        ones++;
    }

    return maxDiff + ones;
}

	       
  
}