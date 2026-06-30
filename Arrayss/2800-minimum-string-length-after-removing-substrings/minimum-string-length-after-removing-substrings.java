class Solution {
    public int minLength(String s) {

        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){

            char current = s.charAt(i);
            if(!st.isEmpty()){
                String str ="" + st.peek() + current;
                if(str.equals("AB") || str.equals("CD")){
                    st.pop();
                }
                else st.push(current);
            }
            else{
                st.push(current);
            }

        }
        return st.size();
        
    }
}