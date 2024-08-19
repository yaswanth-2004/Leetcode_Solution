class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int ele:nums){
            hp.put(ele,hp.getOrDefault(ele,0)+1);
        }
       int a=nums[0];
        for(Map.Entry<Integer,Integer> entry:hp.entrySet()){
            if(entry.getValue()>1){
               a=entry.getKey();
            }
        }
        return a;
    }
}
