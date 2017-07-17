import java.util.*;
@SuppressWarnings("unused")
public class Pronew1 {
public String longestCommonPrefix(String[] strs) {
    String lPrefix = "";
    if(strs.length>0)
    
    {
        lPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String an = strs[i];
        int j=0;
        for(; j<Math.min(lPrefix.length(), strs[i].length()); j++)
        
        {
            if(lPrefix.charAt(j) != an.charAt(j)){
                break;
            }
        }
        lPrefix = strs[i].substring(0, j);
    }
    return lPrefix;
}
}   