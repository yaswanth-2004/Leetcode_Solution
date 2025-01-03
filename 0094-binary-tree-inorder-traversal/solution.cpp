/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*>s;
        TreeNode* curr=root;

        while(true){
            while(curr!=NULL){
                s.push(curr);
                curr=curr->left;

            }
            if(s.empty()) break;
            curr=s.top();
            s.pop();
            res.push_back(curr->val);
            curr=curr->right;//imp
        }
        return res;
    }
};
