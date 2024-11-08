int trap(int* a, int n) {
    int l=0;
    int r=n-1;
    int lm=0;
    int rm=0;
    int res=0;
    while(l<r)
    {
        if(a[l]<a[r])
        {
        if(lm<a[l])
        {
            lm=a[l];
        }
        else
        {
            res+=lm-a[l];
        }
        l++;
        }
        else
        {
            if(a[r]>rm)
            {
                rm=a[r];
            }
            else
            {
                res+=rm-a[r];
            }
            r--;
        }
    }
    return res;

}
