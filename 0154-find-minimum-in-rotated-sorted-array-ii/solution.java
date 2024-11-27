class Solution {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length-1);
    }
    public int findMin(int[] nums, int left, int right)
    {
        if(right==left)
        {
            return nums[left];
        }
        if(right == left +1)
        {
            return Math.min(nums[left], nums[right]);
        }
        int middle = (right-left)/2 + left;
        if(nums[right] > nums[left])
        {
            return nums[left];
        }
        else if(nums[right] == nums[left])
        {
            return findMin(nums, left+1, right);
          
        }
        else if(nums[middle] >= nums[left])
        {
            return findMin(nums, middle, right);
        }
        else
        {
            return findMin(nums, left, middle);
        }
    }
}
