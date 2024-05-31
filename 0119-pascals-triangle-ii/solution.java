class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> second = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            second.add(1);
            for(int j=1;j<i;j++){
                second.add(prev.get(j-1)+prev.get(j));

            }
            second.add(1);
            result.add(second);
        }
        return result.get(rowIndex);
        }
}
