class Solution {
    public int numberOfSteps(int num) {
        return steps(num , 0);
        // indial steps 0

// using while loop
        // int steps=0;
        // while(num!=0){
        //     if(num%2==0){
        //         steps++;
        //         num=num/2;
        //     }
        //     else{
        //         num=num-1;
        //         steps++;
        //     }
        // }
        // return steps;

// using recursion
    
    }
    public static int steps(int num , int step){
        if(num == 0 )return step;
        // understnd stack;
        else if(num%2==0){
            return steps(num/2 , step+1);
        }
        else{
            return steps(num-1,step+1);
        }
    }


    
}