int findMin(int* a, int n) {
    int l=0;
    int r=n-1;
    if(a[0]<a[r]) return a[0];
    while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]>a[n-1]){
            l=mid+1;
        }
        else{
            r=mid-1;
        }
    }
    return a[l];
}
