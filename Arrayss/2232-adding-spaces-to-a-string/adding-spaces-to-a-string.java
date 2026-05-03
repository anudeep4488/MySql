class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] arr = s.toCharArray();

        StringBuilder str = new StringBuilder();

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j==spaces.length){
                str.append(arr[i]);
            }
            else if(i==spaces[j]){
                str.append(" ");
                str.append(arr[i]);
                j++;
            }
            else{
                str.append(arr[i]);
            }
        }

    return str.toString();
    }
}