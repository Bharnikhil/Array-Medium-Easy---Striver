package StriverArrays;

public class MjorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};  // Test case
        MjorityElement obj = new MjorityElement();
        int result = obj.majorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No majority element exists.");
        }

    }
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int count=0;
        int element=0;

        for(int i =0;i<n;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }else if(arr[i]==element){
                count++;
            }else{
                count--;
            }
        }
        int counter1 =0;
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                counter1++;
            }

        }
        if(counter1>n/2){
            return element;
        }
        return -1;
    }
}
