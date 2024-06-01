class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int t=0;
        for(int i=0; i<n-1;i++)
        {
            t+= Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return t;
    }
}
