class Solution {
     public String makeGood(String s) {
    //     StringBuilder sb = new StringBuilder();

    //     // itirate through out the end

    //     for (int i = 0; i < s.length(); i++) {
    //         char current = s.charAt(i);

    //         if (sb.length() > 0 &&
    //             Math.abs(current - sb.charAt(sb.length() - 1)) == 32) {

    //             // Remove the previous character
    //             sb.deleteCharAt(sb.length() - 1);
    //         } else {
    //             // Add the current character
    //             sb.append(current);
    //         }
    //     }

    //     return sb.toString();

    Stack<Character> st = new Stack<>();

    for(int i=0;i<s.length();i++){
        char current = s.charAt(i);

        if(!st.isEmpty() && Math.abs(st.peek()-current) == 32 ){
            st.pop();
        }
        else{
            st.push(current);
        }
    }
    StringBuilder sb = new StringBuilder();

    for (char ch : st) {
        sb.append(ch);
    }

    return sb.toString();

    }
    
}