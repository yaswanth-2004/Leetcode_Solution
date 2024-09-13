class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
    int n=arr.length;
    int[] pre=new int[n+1];
    for(int i=0;i<n;i++){
        pre[i+1]=pre[i]^arr[i];
    }

    int[] arr1=new int[queries.length];
    for(int i=0;i<queries.length;i++){
        int l=queries[i][0];
        int r=queries[i][1];
        arr1[i]=pre[r+1]^pre[l];

    }
    return arr1;
    }
}
