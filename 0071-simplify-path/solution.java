class Solution {
    public String simplifyPath(String path) {
        int l=path.length();
        ArrayList<String> fin =new ArrayList<>();
        char[] p=path.toCharArray();
        String wrd="";
        for(int i=0;i<l-1;i++){
            if(p[i]=='/'){
                int f=i+1;
                while(f<l&&p[f]!='/'){
                    wrd+=p[f];
                    f++;
                }
                i=f-1;
                if(wrd.equals("")){
                    continue;
                    }
                if(wrd.equals("..")){
                    if(!fin.isEmpty()){
                        fin.remove(fin.size()-1);
                    }
                    wrd="";
                }
                else if(wrd.equals(".")){
                    wrd="";
                    continue;
                }
                else{
                    fin.add(wrd);
                    wrd="";
                }
            }            
        }
        String ret="";
        if(fin.isEmpty())return "/";
        for(String a:fin){
            ret+="/";
            ret+=a;
        }
        return ret;
    }
}
