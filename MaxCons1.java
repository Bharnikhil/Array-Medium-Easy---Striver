package StriverArrays;

public class MaxCons1 {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int[] arr){
        int oneCount=0;
        int maxCount=0;

        int i=0;

        while(i<arr.length){
            if(arr[i]==1){
                oneCount+=1;
                i++;
            }else{
                oneCount=0;
                i+=1;
            }
            maxCount=Math.max(maxCount,oneCount);
        }
        return maxCount;
    }
}
