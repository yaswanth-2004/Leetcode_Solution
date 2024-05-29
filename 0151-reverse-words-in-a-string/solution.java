class Solution {
    public String reverseWords(String s) {
       String[] words=s.split(" ");

       StringBuilder rev = new StringBuilder();
       for (int i = words.length - 1; i >= 0; i--) {
            if(!words[i].isEmpty()){
                rev.append(words[i]).append(" ");
            }
       }
       return rev.toString().trim();
    }
}
