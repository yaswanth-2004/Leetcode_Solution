class Solution {
    public int[][] merge(int[][] intervals) {
        // Sweepline algorithm
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }
        int[] mp = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            mp[start] = Math.max(end + 1, mp[start]);
        }
        int r = 0;
        int initialStart = -1;
        int have = -1;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (initialStart == -1)
                    initialStart = i;
                have = Math.max(mp[i] - 1, have);
            }
            if (have == i) {
                intervals[r++] = new int[] { initialStart, have };
                initialStart = -1;
                have = -1;
            }
        }
        if (initialStart != -1) {
            intervals[r++] = new int[] { initialStart, have };
        }
        if (intervals.length == r) {
            return intervals;
        }
        int[][] res = new int[r][];
        for (int i = 0; i < r; i++) {
            res[i] = intervals[i];
        }
        return res;
        // General Approach
        // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        // int m=intervals.length;
        // int[][] answer=new int[m][2];
        // ArrayList<int[] > list=new ArrayList<>();
        // list.add(intervals[0]);
        // for(int i=1;i<m;i++){
        // int[] lasInterval=list.get(list.size()-1);
        // if(lasInterval[1]>=intervals[i][0]){
        // int maxEnd=Math.max(lasInterval[1],intervals[i][1]);
        // lasInterval[1]=maxEnd;
        // list.set(list.size()-1,lasInterval);
        // }
        // else{
        // list.add(intervals[i]);
        // }
        // }
        // return list.toArray(new int[list.size()][2]);
    }
}

// int j=0;
// list.add(intervals[0]);
// // answer[0]=intervals[0]; answer[j][1]
// for(int i=0;i<m;i++){
// if(list.get(j)[1]>=intervals[i][0]){
// list.set(j)
// answer[j][1]=intervals[i][1]; //math of both prefered
// }
// else{
// answer[++j]=intervals[i];
// }
// }
