/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    int x,y;
    if(root==NULL)
     return 0;
    x=minDepth(root->left);
    y=minDepth(root->right);
    if((x==0) ^(y==0))
    return (x>y?x:y)+1;
    if(x>y)
        return y+1;
    else
        return x+1;
}
