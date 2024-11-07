/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElements(int* a, int n, int* rs) {
    *rs=n;
    int* p = (int*)malloc(sizeof(int)*(n*2)); 
    int* arr=(int*)malloc(sizeof(int)*n);
    for(int i=0;i<n;i++){
        p[i]=a[i];
        p[i+n]=a[i];
    }
    for(int i=0;i<n;i++){
        arr[i]=-1;
        for(int j=i+1;j<n*2;j++){
            if(a[i]<p[j]){
                arr[i]=p[j];
                break;
            }
        }
    }
    return arr;
}
