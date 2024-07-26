class Solution {
    public void rotate(int[][] matrix) {
       int a[][]=new int[matrix.length][matrix.length];
       int l,k=0;
       for(int i=0;i<matrix.length;i++)
       {
        l=0;
        for(int j=matrix.length-1;j>=0;j--)
        {
            a[k][l]=matrix[j][i];
            l++;
        }
        k++;
       }
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=0;j<matrix.length;j++)
        {
            matrix[i][j]=a[i][j];
        }
       }
    }
}
