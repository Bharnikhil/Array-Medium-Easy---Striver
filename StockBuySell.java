package StriverArrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4}; // Sample input array

        StockBuySell sbs = new StockBuySell();
        int result = sbs.maxProfit(arr);

        System.out.println("Maximum profit (single transaction): " + result);


    }
    public int maxProfit(int[] arr) {
        int maxProfit=0;
        int min=Integer.MAX_VALUE;

        int i=0;
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];


            }
            int profit=arr[i]-min;
            maxProfit=Math.max(profit,maxProfit);
            i++;





        }
        return maxProfit;
    }
}
