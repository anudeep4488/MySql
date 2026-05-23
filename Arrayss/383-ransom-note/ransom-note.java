class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] arr = magazine.toCharArray();

        int j=0;

        while(j<ransomNote.length()){
            for(int i =0;i<arr.length;i++){
                if(arr[i] == ransomNote.charAt(j)){
                    arr[i]='1';
                    j++;
                    break;
                }
                else if(i == arr.length-1){
                    return false;
                }
            }
            

        }
        return true;
        
    }
}