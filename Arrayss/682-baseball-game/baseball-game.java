class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for(String op : operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int top = st.peek();
                int newVal = top * 2;

                //af=dten making it doble pudh back to stcak 
                st.push(newVal);

            }
            else if(op.equals("+")){
                int top = st.pop();
                int sum = top + st.peek();

                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(op));
            }

        }        
        int sum =0;

        // for for each you just pass referenece varavble no need to use pop(())
        for(int i : st){
            sum+=i;

        }
        return sum;
        
    }
}