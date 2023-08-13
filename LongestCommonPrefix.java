import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.println("Output: "+ longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s="";
        int n=strs.length;
        Arrays.sort(strs);
        String si=strs[0];
        String ei=strs[n-1];
        for(int i=0;i<si.length();i++){
            if(si.charAt(i)!=ei.charAt(i)){
                break;
            }
            s=s+si.charAt(i);
        }
        return s;
    }
}
