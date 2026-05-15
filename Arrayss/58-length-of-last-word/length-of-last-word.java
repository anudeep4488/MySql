class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.trim();
        // String[] arr = st.split(" ");
        // return arr[arr.length-1].length();

        for(int i = st.length()-1;i>=0;i--){
            if(st.charAt(i) == ' '){
                return st.length() - (i+1) ;
            }


        }
        return st.length();
      
    }
}