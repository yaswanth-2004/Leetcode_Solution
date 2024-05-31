class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =new ArrayList<>();
        if(numRows==0){
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> second = new ArrayList<>();
            List<Integer> prev= result.get(i-1);
            second.add(1);
            for(int j=1;j<i;j++){
                second.add(prev.get(j-1)+prev.get(j));
            }
            second.add(1);
            result.add(second);

        }
        return result;
    }
}
