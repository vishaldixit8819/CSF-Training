import java.util.*;

public class ValidAnagram {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char s_chars[] = s.toCharArray();
        char t_chars[] = t.toCharArray();
        
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);
        
        return Arrays.equals(s_chars, t_chars);
    }
}
