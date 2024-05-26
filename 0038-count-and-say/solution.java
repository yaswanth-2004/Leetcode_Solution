class Solution{
    public String countAndSay(int n){
        if(n==1) return "1";
        int l=0,r=1;
        String s= countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(;r<s.length();r++){
            if(s.charAt(r)!=s.charAt(l)){
                sb.append(r-l).append(s.charAt(l));
                l=r;
            }
        }
        sb.append(r-l).append(s.charAt(l));
        return sb.toString();
    }
}
