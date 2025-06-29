package StriverArrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersinArray {
    public static void main(String[] args) {
        // Array Initialization.
        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans= leaders(arr);
        System.out.println(ans);

    }
    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max= arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        // Reverse the list to match original array order
        Collections.reverse(list);
        return list;

    }
}
