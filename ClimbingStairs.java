import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Output: "+ climb_stairs(num));
    }

    private static int climb_stairs(int num) {
        if (num<3){
            return num;
        }
        int a=1 ,b=2,sum=0;
        for(int i=3;i<=num;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}

