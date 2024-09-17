class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map1=new HashMap<>();
        List<String> list=new ArrayList<>();

        String []words=s1.split(" ");
        String []words1=s2.split(" ");
        for( String s:words){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for (String word:map1.keySet()){
           if(map1.get(word)==1){
                    list.add(word);
           } 
        } 
       return list.toArray(new String[0]);
       
    }
}