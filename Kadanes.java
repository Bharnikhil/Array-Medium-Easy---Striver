package StriverArrays;

public class Kadanes {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // Example input

        int result = maxSubarraySum(nums);
        System.out.println("Maximum subarray sum is: " + result);

    }
    public static int maxSubarraySum(int[] nums) {
        // Your code here
        int sum =0;
        int maxi=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
