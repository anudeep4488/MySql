class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // StringBuilder sb = new StringBuilder();
        // if(s1.equals(s2)) return true;

        // for(int i =0; i<s2.length()-1;i++){
        //     for(int j =i+1; j<s2.length();j++){
                
        //         sb.append(s2);
        //         char a = sb.charAt(j);
        //         sb.setCharAt(j,sb.charAt(i));
        //         sb.setCharAt(i,a);

        //         if(s1.equals(sb.toString())){
        //             return true;
        //         }else{
        //             sb.setLength(0);
        //         }

        //     }
        // }

        // return false;
       
        // Already equal
        if (s1.equals(s2)) {
            return true;
        }

        int first = -1;
        int second = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                count++;

                if (count == 1) {
                    first = i;
                } else if (count == 2) {
                    second = i;
                } else {
                    return false; // More than 2 mismatches
                }
            }
        }

        // Exactly one mismatch cannot be fixed by one swap
        if (count != 2) {
            return false;
        }

        // Check if swapping fixes the strings
        return s1.charAt(first) == s2.charAt(second) &&
               s1.charAt(second) == s2.charAt(first);
    
        
    }
}