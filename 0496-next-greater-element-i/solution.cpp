class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int>m;
        stack<int>s;
        for(auto i:nums2)
        {
            while(!s.empty() && i>s.top())
            {
                m[s.top()]=i;
                s.pop();
            }
            s.push(i);
        }
        while(!s.empty())
        {
            m[s.top()]=-1;
            s.pop();
        }
        vector<int> res;
        for(int i:nums1)
        {
            res.push_back(m[i]);
        }
        return res;
    }
};
