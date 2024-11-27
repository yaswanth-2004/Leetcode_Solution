class Solution {
    public static void generateall(int index, ArrayList<String> list, int open, int close,ArrayList<String> finaly) {
        if (index == 1) {
            StringBuilder str=new StringBuilder();
            for (String k : list) {
                str.append(k);
            }
            finaly.add(str.toString());
            return;
        }
        if (open > 0) {
            list.add("(");
            generateall(index - 1, list, open - 1, close,finaly);
            list.remove(list.size() - 1);
        }
        if (close > open) {
            list.add(")");
            generateall(index - 1, list, open, close - 1,finaly);
            list.remove(list.size() - 1);
        }

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<String> finaly=new ArrayList<String>();
        generateall(2*n+1,list,n,n,finaly);
        return finaly;
    }
}
