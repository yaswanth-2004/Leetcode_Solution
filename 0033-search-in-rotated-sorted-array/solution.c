    int bs(int *a,int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target) right=mid-1;
            else left=mid+1;

        }
        return -1;

    }

    int findMinInd(int *nums,int n){
        int left=0,right=n-1;
        if(nums[0] <= nums[right]) return 0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]>nums[n-1]){
                left=mid+1;

            }
            else right=mid-1;
        }
        return left;
    }

    int search(int* a, int n, int target) {
        int minInd=-1;
        minInd=findMinInd(a,n);
        int ans=-1;
        ans=bs(a,0,minInd-1,target);
        if(ans !=-1) return ans;
        return bs(a,minInd,n-1,target);
        
    }
