import java. util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        // unicode character means
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        String sorted = new String(str1);
        String sorted1 = new String(str2);



        return sorted.equals(sorted1);

        
    }
}