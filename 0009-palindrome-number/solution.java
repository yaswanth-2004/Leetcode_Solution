class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int sum=0;
        int ori=x;
        while(x!=0)
        {
            int a = x%10;
            sum=sum*10+a;
            x/=10;
         

        }
        return ori==sum;
       
    }
}
