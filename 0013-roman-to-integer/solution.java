class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        int a=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && hp.get(s.charAt(i))<hp.get(s.charAt(i+1))){
                a-=hp.get(s.charAt(i));
            }
            else{
                a+=hp.get(s.charAt(i));
            }
        }
        return a;
    }
}
