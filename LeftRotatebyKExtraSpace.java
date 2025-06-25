package StriverArrays;

import java.util.Arrays;

public class LeftRotatebyKExtraSpace {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;  // rotate left by k places

        leftRotate(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void leftRotate(int[] arr, int n, int k) {
        int temp[] = new int[n];
        k = k % n;  // in case k >= n

        for (int i = 0; i < n; i++) {
            temp[(i - k + n) % n] = arr[i];  // shift left
            /*
            The new index after left rotation for element at index i is:
            newIndex = (i - k + n) % n
            (We add n before % n to avoid negative indices.)
             */
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];  // copy back
        }
    }
}
