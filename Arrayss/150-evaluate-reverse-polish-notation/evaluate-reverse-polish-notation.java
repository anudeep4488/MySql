import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        // Stack<Integer> stack = new Stack<>();

        // for (String token : tokens) {

        //     if (token.equals("+")) {
        //         int b = stack.pop();
        //         int a = stack.pop();
        //         stack.push(a + b);

        //     } else if (token.equals("-")) {
        //         int b = stack.pop();
        //         int a = stack.pop();
        //         stack.push(a - b);

        //     } else if (token.equals("*")) {
        //         int b = stack.pop();
        //         int a = stack.pop();
        //         stack.push(a * b);

        //     } else if (token.equals("/")) {
        //         int b = stack.pop();
        //         int a = stack.pop();
        //         stack.push(a / b);

        //     } else {
        //         // token is a number
        //         stack.push(Integer.parseInt(token));
        //     }
        // }

        // return stack.pop();

                Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if ("+-*/".contains(token) && token.length() == 1) {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();

        
    }
}