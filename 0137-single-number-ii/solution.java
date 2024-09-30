class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        for(int i:hp.keySet()){
            if(hp.get(i)==1)
                return i;
        }
        return 0;
    }
}
