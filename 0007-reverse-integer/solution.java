class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        int reversed =0;
       while(n!=0)
       {
    
          int digit=n%10;
          if(reversed>(Integer.MAX_VALUE-digit)/10){
            return 0;
          }
          reversed =reversed*10+digit;
          n/=10;

       }
        return (x<0)?(-reversed):(reversed);
    }
}
