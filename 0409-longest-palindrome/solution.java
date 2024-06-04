class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> charFrequency = new HashMap<>();
        int odd=0;
        for(char ch:s.toCharArray()){
            charFrequency.put(ch,charFrequency.getOrDefault(ch,0)+1);
            if(charFrequency.get(ch)%2==1)
                odd++;
            else
                odd--;
        }
        if(odd>1)
            return s.length() - odd+1;
        return s.length();
    }
}
