class Solution {
    public String baseNeg2(int n) {
        StringBuilder sb=new StringBuilder();
        if(n==0) return "0";
        while(n!=0){
            int a=n%-2;
            n=n/-2;
            if(a<0){
                a+=2;
                n++;
            }
            sb.append(a);
            
        }
        sb.reverse();
        return sb.toString();
    }
}
