import java. util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        // unicode character means

        // you cant sort stinngs directly you have to convert to chararry then sort
        
        // char[] str1 = s.toCharArray(); //O(n)
        // char[] str2 = t.toCharArray();
        // // sort menthod is void menthod wont return any thing  just directly sort , dont try to stor in anything
        
        // Arrays.sort(str1); //O(n log n)
        // Arrays.sort(str2);
        

        // String sorted = new String(str1); // O(n)
        // String sorted1 = new String(str2);

        // return sorted.equals(sorted1);

        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char a : s.toCharArray()){
            map.put(a , map.getOrDefault(a , 0) + 1 );
        }

        for(char a : t.toCharArray()){
            if(!map.containsKey(a)){
                return false;
            }
            else{
                map.put(a, map.getOrDefault(a , 0)-1);
            }
        }

        for(int val : map.values()){
            if(val > 0){
                return false;
            }
        }

    return true; 
    }
}