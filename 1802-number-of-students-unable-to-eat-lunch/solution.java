import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studone=0;
        int studzero=0;
       for(int i:students)
       {
            studone+=i;
       }
       studzero=students.length-studone;
        for(int ii:sandwiches)
        {
            if(ii==1)
            {
               if(studone>0){
                studone--;
               }
               else{
                break;
               }
            }
            else{
                if(studzero>0){
                    studzero--;
                }
                else{
                    break;
                }
            }
           
        }
        return studzero+studone;

    }
}
