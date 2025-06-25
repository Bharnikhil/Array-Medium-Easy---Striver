package StriverArrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] moveZeros(int[] arr, int n){
        int i =-1;
        int j =0;
        while(j< arr.length){
            if(arr[j]==0){
                j++;
            }else{
                swap(arr,j,i+1);
                i++;
                j++;
            }

        }
        return arr;


    }
    public static void swap(int[] arr, int a ,int b ){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
