class Solution {
    public String largestNumber(int[] nums) {
       String str[]=new String[nums.length];
       for(int i=0;i<nums.length;i++){
        str[i]=Integer.toString(nums[i]);
       }
       Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
       if(str[0].equals("0"))
       return "0";
       StringBuilder res=new StringBuilder();
       for(String a:str){
        res.append(a);
       }
       return res.toString();
        

            
        
    }
}
