class Solution {
    public int appendCharacters(String s, String t) {
       int sInd=0,tInd=0;
       int sLen=s.length(),tLen=t.length();

       while(sInd<sLen && tInd<tLen){
        if(s.charAt(sInd)==t.charAt(tInd)){
            tInd++;
        }
        sInd++;
       }

        return tLen-tInd;

    }
}
