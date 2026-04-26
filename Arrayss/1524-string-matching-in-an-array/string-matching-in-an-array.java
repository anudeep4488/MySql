class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        for(int j=0;j<words.length;j++){
            for(int i=0;i<words.length;i++){

                if(words[i]==words[j]){
                    continue;
                }

                if(words[i].contains(words[j])){
                    list.add(words[j]);
                    break;
                }
            }

        }
        return list;
        
    }
}