class Solution {
    public String largestNumber(int[] nums) {
        String st[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            st[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(st,(a,b)->(b+a).compareTo(a+b));
        if(st[0].equals("0"))
        return "0";
        StringBuilder sb=new StringBuilder();
        for(String a:st){
            sb.append(a);
        }
        return sb.toString();
        
    }
}
