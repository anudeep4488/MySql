class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        if(s1.equals(s2)) return true;

        for(int i =0; i<s2.length()-1;i++){
            for(int j =i+1; j<s2.length();j++){
                
                sb.append(s2);
                char a = sb.charAt(j);
                sb.setCharAt(j,sb.charAt(i));
                sb.setCharAt(i,a);

                if(s1.equals(sb.toString())){
                    return true;
                }else{
                    sb.setLength(0);
                }

            }
        }

        return false;
        
    }
}