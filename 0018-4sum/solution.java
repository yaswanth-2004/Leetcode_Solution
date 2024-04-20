class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target&& nums[i]>0){
                break;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;

                while(k<l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                        while(k<l && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l-1]){
                            l--;
                        }
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
