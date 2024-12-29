class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        int minDays=-1,left=0,right=1e9;
        while(left<=right){
            int bloomCount=0,nofB=0;
            int mid=(left+right)/2;
            for(auto bloom:bloomDay){
                if(bloom<=mid) ++bloomCount;
                else bloomCount=0;
                if(bloomCount==k){
                    nofB++;
                    bloomCount=0;
                }
            }
            if(nofB>=m){
                minDays=mid;
                right=mid-1;
            }
            else left=mid+1;
        }  
        return minDays;          
    }
};
