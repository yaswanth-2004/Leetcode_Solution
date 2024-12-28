class Solution {
public:
    int findMin(vector<int>& nums) {
        int l=0;
        int r=nums.size()-1;
        
        if(nums[0]<=nums[r]) return nums[0]; 
        while(l<=r){

        int mid=(l+r)/2;
        if(nums[mid]>nums[mid+1]){
            return nums[mid+1];
        }
        else if(nums[mid-1]>nums[mid]){
            return nums[mid];
        }
        else if(nums[mid]>nums[0]) l=mid+1;
        else r=mid+1;


        }
    return nums[0];
    }
};
