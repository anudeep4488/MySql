class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        // int j = 0;
        // // here for wont work for all test cases because we have to check previosy elemey also  remember is previosu elemet is matches  then wwe have to think about stcak
        // int i =0;
        // while(i<pushed.length){

        //     while(i>=0 && j<popped.length && pushed[i] == popped[j]){
        //         pushed[i] = -1;
        //         j++;
        //         while(i>=0 && pushed[i-1] == -1){
        //             i--;
        //         }
        //         i--;
        //     }
        //     i++;
        // }
        // for(int k = pushed.length -1;k>=0;k--){
        //     if(pushed[k] == -1) continue ;
        //     else if(pushed[k] != popped[k]){
        //         return false;
        //     }
        //     else {
        //         j++;
        //     }
        // }
        // return true;
        int j = 0;
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i =0 ; i<=pushed.length;i++){

            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
            if(i < pushed.length){
                st.push(pushed[i]);

            }
        }   
        return  st.isEmpty();   

    // solving ithout using stcak how use only inputva arry every time think can we do that or nnot
    // int top = -1;
    // int j = 0;

    // for (int x : pushed) {

    //     pushed[++top] = x;

    //     while (top >= 0 && pushed[top] == popped[j]) {
    //         top--;
    //         j++;
    //     }
    // }

    // return top == -1;
    }
}