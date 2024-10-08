class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        StringBuilder sb = new StringBuilder(a);
        String b=sb.reverse().toString();
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
}
