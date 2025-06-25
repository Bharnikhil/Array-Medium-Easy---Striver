package StriverArrays;
import java.util.Arrays;

public class RightRotatebyKusingExtraSpace {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;  // rotate by k places

        rightRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightRotate(int[] arr, int n, int k) {
        int temp[] = new int[n];
        k = k % n;  // in case k is larger than n

        // Place each element at its new position
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        // Copy temp back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
