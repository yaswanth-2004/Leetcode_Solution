class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int ele:nums){
            hp.put(ele,hp.getOrDefault(ele,0)+1);
        }
        int maxFreq=0;
        int maxEle=nums[0];
        for(Map.Entry<Integer,Integer> entry:hp.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxEle=entry.getKey();
            }
        }

    return maxEle;
    }
}
