class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> str = new HashMap<>();

        for(String word:strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
              if(!str.containsKey(sorted)){
            str.put(sorted,new ArrayList<>());
        }
        str.get(sorted).add(word);
        }

      
        return new ArrayList<>(str.values());
    }
}
