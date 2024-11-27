class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>res=new ArrayList<>();
        dfs(candidates,res,new ArrayList<>(),0,target,0);
        return res;
    }
    public void dfs(int[] candidates,List<List<Integer>>res,List<Integer>list,int idx,int target,int sum){
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum>target||idx>=candidates.length){
            return;
        }
        //include
        list.add(candidates[idx]);
        dfs(candidates,res,list,idx+1,target,sum+candidates[idx]);
        list.remove(list.size()-1);
        //exclude
        while(idx+1<candidates.length&&candidates[idx]==candidates[idx+1]){
            idx++;
        }
        dfs(candidates,res,list,idx+1,target,sum);
    }
}
