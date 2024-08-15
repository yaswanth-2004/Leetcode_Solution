class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int sum=0,maxlen=0;
        hp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]==1?1:-1;
            if(hp.containsKey(sum)){
                maxlen=Math.max(maxlen,i-hp.get(sum));
            }
            else{
                hp.put(sum,i);
            }
        }
        return maxlen;
    }
}
