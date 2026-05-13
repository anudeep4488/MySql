import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                prices[i] = prices[i] - prices[j];
                break;                   
                }
            }
            
        }
        return prices;


        // Stack<Integer> st = new Stack<>();

        // for(int i=prices.length-1 ; i>=0;i--){

        //     while(!st.isEmpty() && st.peek()>prices[i]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         st.push(prices[i]);
               
        //     }
        //     else{
        //         int temp = prices[i];
        //         prices[i] = prices[i]  - st.peek();
        //         st.push(temp);
        //     }
        // }
        // return prices;
        
    }
}