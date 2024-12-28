int search(int* nums, int numsSize, int target) {
   
    int l=0,r=numsSize-1;
    
    while(l<=r){
        int mid=((r-l)/2)+l;
        if(target>nums[mid]){
           l=mid+1;
        }
        else if(target<nums[mid]){
            r=mid-1;
        }
        else{
            return mid;
        }
        
    }
    return -1;
}
