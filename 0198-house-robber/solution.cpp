class Solution {
public:
    int solve(int i,vector<int>& nums,vector<int>& dp){
        int n=nums.size();
        if(i>=n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        else
            return dp[i]=max(nums[i]+solve(i+2,nums,dp),solve(i+1,nums,dp));
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        vector<int> dp(n+1,-1);
        return solve(0,nums,dp);
    }
};
