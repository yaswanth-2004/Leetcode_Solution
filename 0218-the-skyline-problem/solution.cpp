class Solution {
public:
    vector<vector<int>> getSkyline(vector<vector<int>>& buildings) {
        multiset<int> height;
        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;
        vector<vector<int>> ans;
        set<int> st;
        int j=0;
        for(int i=0; i<buildings.size();i++){st.insert(buildings[i][0]);st.insert(buildings[i][1]);}
        for(auto i :st){
            while(!pq.empty()&& pq.top().first <= i){
                height.erase(height.find(pq.top().second));
                pq.pop();
            }
            while(j<buildings.size()&&buildings[j][0]==i){
                pq.push({buildings[j][1],buildings[j][2]});
                height.insert(buildings[j][2]);
                j++;
            }
            if(height.size()==0 && (ans.size()==0 || ans[ans.size()-1][1] !=0)) ans.push_back({i,0});
            else if(height.size()>0){
                auto it =height.rbegin(); 
                if(ans.size()==0 || ans[ans.size()-1][1] !=*it)ans.push_back({i,*it});
            }
        }
        return ans;
    }
};
