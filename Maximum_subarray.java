import java.util.*;
class Maximum_subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = maxSubArray(arr);
        System.out.println("Output:"+ temp);
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
        
    }

}