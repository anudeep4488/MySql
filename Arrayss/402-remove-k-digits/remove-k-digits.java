class Solution {
    public String removeKdigits(String num, int k) {
        int a =k;
        Stack<Character> st = new Stack<Character>();

        if(num.length()==k) return "0";

        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && a>0 && st.peek()>num.charAt(i)){
               st.pop();
               a--;          
            }
        st.push(num.charAt(i));
        }
        while (a > 0) {
            st.pop();
            a--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch :st){
            sb.append(ch);
        }
        String ans = sb.toString();
        int i=0;
        while(i<ans.length() && ans.charAt(i) == '0'){
            i++;
        } 
        return i == ans.length() ? "0" :ans.substring(i);       
        
    } 
}