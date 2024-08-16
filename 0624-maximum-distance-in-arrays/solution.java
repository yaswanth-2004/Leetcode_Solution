class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int small=arrays.get(0).get(0);
        int large=arrays.get(0).get(arrays.get(0).size()-1);
        int maxd=0;

        for(int i=1;i<arrays.size();i++){
            maxd=Math.max(maxd,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-small));
            maxd=Math.max(maxd,Math.abs(large-arrays.get(i).get(0)));
            small=Math.min(small,arrays.get(i).get(0));
            large=Math.max(large,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return maxd;
    }
    
}
