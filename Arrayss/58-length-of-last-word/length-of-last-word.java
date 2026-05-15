class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.trim();
        String[] arr = st.split(" ");
        return arr[arr.length-1].length();


        
    }
}