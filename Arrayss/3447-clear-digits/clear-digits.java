class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                 sb.append(s.charAt(i));
            }
            else {
                sb.deleteCharAt(sb.length()-1);
            }
            i++;
        }
        return sb.toString();
    }
}