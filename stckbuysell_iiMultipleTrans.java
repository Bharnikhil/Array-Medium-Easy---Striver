package StriverArrays;

public class stckbuysell_iiMultipleTrans {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};  // Example input

        int profit = stockBuySell(arr); // Calling the function

        System.out.println("Maximum profit (multiple transactions): " + profit);

    }
     static int stockBuySell(int arr[]) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
}
