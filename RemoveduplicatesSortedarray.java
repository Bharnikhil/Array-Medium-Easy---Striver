package StriverArrays;



public class RemoveduplicatesSortedarray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int n = arr.length;
        int k = removeDuplicates(arr,n);
        System.out.println("after removing duplicate elements our array will be:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr,int n){
        int i=0;
        int j=1;
        int numofdistinct=0;

        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                swap(arr,i+1,j);
                numofdistinct++;
                i++;
                j++;
            }
        }
        return numofdistinct+1;


    }
    public static void swap(int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
