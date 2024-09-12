class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        HashSet<Character> set=new HashSet<>();
        for(Character c:allowed.toCharArray()){
            set.add(c);
        }
        for(String wo : words){
            for(int j=0;j<wo.length();j++){
                if(!set.contains(wo.charAt(j)))
                {
                    count--;
                    break;   
                }
            }
        }
        return count;
        }
    }

