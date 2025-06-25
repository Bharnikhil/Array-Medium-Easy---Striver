package StriverArrays;

import java.util.Arrays;

public class leftRotate1place {
    public static void main(String[] args) {
        int n=5;

        int arr[]= {1,2,3,4,5};
        solve(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void solve(int[] arr, int n){
        int temp= arr[0];
        int i =0;
        int j=1;

        while(j< arr.length){
            arr[i]=arr[j];
            i++;
            j++;
        }
        arr[n-1]=temp;


    }
}
