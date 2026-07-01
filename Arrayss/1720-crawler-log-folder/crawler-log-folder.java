class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<logs.length;i++){
            if(!st.isEmpty()){
                if(logs[i].equals("../")){
                    st.pop();
                }
            }
            if(!logs[i].equals("./") && !logs[i].equals("../")){
                st.push(logs[i]);
            }

        }
        return st.size();
        
    }
}