package MyJavaProject.LetCode;

import java.util.Arrays;

public class LOngest_Common_Prefix {
    public static String longestCommonprefix(String[] strs)
    {
        if (strs==null || strs.length==0)
        {
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while (i<first.length()&&i<last.length()&&first.charAt(i)==last.charAt(i))
        {
            i++;
        }
        return first.substring(0,i);




    }
    public static void main(String[] args) {
       String[] words={"flower","flow","flight"};
        System.out.println(longestCommonprefix(words));


    }
}
