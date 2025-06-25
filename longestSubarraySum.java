package StriverArrays;
public class longestSubarraySum {
    public static void main(String[] args) {
        int[] a = {2, 3, 5};
        int k = 5;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);

    }
    public static int getLongestSubarray(int[] arr, int k){
        int i =0;
         int j =0;
         int maxLength=0;
         int sum=0;
         while(j<arr.length){
             sum+=arr[j];
             while(sum>k){
                 sum-=arr[i];
                 i++;

             }

             if(sum==k){
                 maxLength=Math.max(maxLength,j-i+1);

             }
             j++;


         }
         return maxLength;
    }
}