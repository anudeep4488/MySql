class Solution {
    public int strStr(String haystack, String needle) {
        
        // int j=0;
        // int index =0;
        // int k=0;

        // if((haystack.charAt(k)==needle.charAt(j)) && (haystack.length()==needle.length()) ){
        //     return 0;
        // }
     

        // for(int i = k;i<haystack.length();i++){
        //     if(j==needle.length()){
        //         return index - needle.length()+1;
        //     }

        //     else if(haystack.charAt(i)==needle.charAt(j)){
        //         index=i;
        //         j++;
            
        //     }
        //     else{
        //         j=0;
        //     }
        // }
        // return -1;\

        return haystack.indexOf(needle);
        
    }
}