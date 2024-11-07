/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* nextGreaterElement(int* a, int n, int* b, int m, int* num) {
    int f=0;
    int *p = (int*) malloc(sizeof(int)*n);
    for(int i=0;i<n;i++){
        p[i]=-1;
        f=0;
        for(int j=0;j<m;j++){
            if(a[i]==b[j]) f=1;
            if(f && b[j]>a[i]){
                p[i]=b[j];
                break;
            }
        }
    }
    *num=n;
    return p;
    
}
