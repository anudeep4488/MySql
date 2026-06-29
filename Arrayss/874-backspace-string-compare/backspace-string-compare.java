class Solution {
    public boolean backspaceCompare(String s, String t) {
        // StringBuilder sb1  = new StringBuilder();
        // StringBuilder sb2  = new StringBuilder();

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='#'){
        //         if(sb1.length()>0){
        //             sb1.deleteCharAt(sb1.length()-1);
        //         }
                
        //     }
        //     else{
        //         sb1.append(s.charAt(i));
        //     }
        // }
        // for(int i=0;i<t.length();i++){
        //     if(t.charAt(i)=='#'){
        //         if(sb2.length()>0){
        //             sb2.deleteCharAt(sb2.length()-1);
        //         }
                
        //     }
        //     else{
        //         sb2.append(t.charAt(i));
        //     }
        // }

        // if(sb1.toString().equals(sb2.toString()) ||(sb1 == null && sb2 == null)){
        //     return true;
        // }
        // else return false;

        Stack<Character>st1 = new Stack<>();
        Stack<Character>st2 = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
            else if(!st1.isEmpty()){
                st1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else if(!st2.isEmpty()){
                st2.pop();
            }
        }
        if(st1.size()!=st2.size())return false;

        while(!st1.isEmpty()){
            if(st1.pop()!=st2.pop()) return false;
        }
    return true; 
    }
}