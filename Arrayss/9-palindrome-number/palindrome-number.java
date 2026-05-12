class Solution {
    public boolean isPalindrome(int x) {
        String st =Integer.toString(x);
        String rev = new StringBuilder(st).reverse().toString();
        return st.equals(rev);


        
    }
}