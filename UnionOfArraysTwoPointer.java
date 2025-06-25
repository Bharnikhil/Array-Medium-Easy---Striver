package StriverArrays;

import java.util.ArrayList;

public class UnionOfArraysTwoPointer {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4};

        ArrayList<Integer> list = unionArrays(arr1, arr1.length, arr2, arr2.length);
        System.out.println(list);
    }
    public static ArrayList<Integer> unionArrays(int[] arr1,int n,int[] arr2,int m) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;



        while (i < n && j < m) {
            if(arr1[i]<=arr2[j]) {
                if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);


                }
                i++;
            }else {
                    if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr2[j]) {
                        unionList.add(arr2[j]);


                    }
                j++;

                }

            }
        while (i < n) // IF any element left in arr1
        {
            if (unionList.get(unionList.size()-1) != arr1[i]){
                unionList.add(arr1[i]);


            }
            i++;

        }
        while (j < m) // If any elements left in arr2
        {
            if (unionList.get(unionList.size()-1) != arr2[j]){
                unionList.add(arr2[j]);


            }
            j++;

        }
        return unionList;

        }
    }

