import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()) {

            // opening brackets
            if(ch == '(' || ch == '{' || ch == '[') {

                st.push(ch);
            }

            // closing brackets
            else {

                // no opening bracket available
                if(st.isEmpty()) {
                    return false;
                }
               // we actually pop it and compare
                char top = st.pop();
            // we dont use peek() beace it just to see the top element , actually we wanna pop it and check the top element 
                // mismatch
                if((ch == ')' && top!= '(') ||
                   (ch == '}' && top!= '{') ||
                   (ch == ']' && top!= '[')) {

                    return false;
                }
            }
        }

        // all brackets should be matched
        return st.isEmpty();
    }
}