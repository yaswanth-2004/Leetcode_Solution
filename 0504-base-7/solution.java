class Solution {
    public String convertToBase7(int num) {
        StringBuilder s=new StringBuilder();
        ArrayList<Integer> ar=new ArrayList();
        if(num==0) return "0";
        if(num<0) s.insert(0,"-");
        while(num!=0){
            int a=num%7;
            if(num>0){
                ar.add(a);
            }
            else{
                ar.add(a*(-1));
            }
            num=num/7;
        }
        Collections.reverse(ar);
        for(int i:ar){
            s.append(i);
        }
        return s.toString();
        
    }
}
