class MyCalendar {
    ArrayList<int[]> ar=new ArrayList<>();

    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for(int x[] : ar)
        {
            if((start>=x[0] && start<x[1]) || (end>x[0] && end<x[1]) || (start<=x[0] && end>=x[1]))
                return false;
        }
        ar.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
