class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output =new int[2];
        output[0]=-1;
        output[1]=-1;
        int c=0;
        for(int i=0;i<nums.length;i++){
           
                if(nums[i]==target){
                    output[0]=i;
                    break;

                }

            
        }
        if(output[0]!=-1){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target){
                    output[1]=i;
                    break;
                }
            }
        }
        return output;
    }
}
