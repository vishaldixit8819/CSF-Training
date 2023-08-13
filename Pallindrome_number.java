import java.util.*;
public class Pallindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPalindrome(num);
        System.out.println("Output: "+ ans);
    }
    public static boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int temp=0;
        int preX=x;
        while(x>temp){
            int pop=x%10;  
            temp=temp*10+pop;
            x/=10;
            
        }
        return x==temp||x==temp/10;
        
    }
}
