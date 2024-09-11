class Solution {
    public int minBitFlips(int start, int goal) {
    int c=0;
    while(start>0 || goal>0){
        int a=(start & 1);
        int b=(goal & 1);
        c+=a!=b?1:0;

        start=start>0?start>>1:0;
        goal=goal>0?goal>>1:0;
    }
    return c;
    
    

    }
}
