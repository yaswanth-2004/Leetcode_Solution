class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=0;
            if(nums[i]%2==0){
                temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
                c++;
            }
        }
        return nums;
    }
}
