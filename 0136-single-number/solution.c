int singleNumber(int* a, int n) {
    int c=0;
    for(int i=0;i<n;i++){
        c=0;
         for(int j=1;j<n;j++){
            if(a[i]==a[(i+j)%n]){ ++c; break;}
         }
         if(c==0){
            return a[i];
         }
    }
    return 0;
}
