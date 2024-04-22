package MediumProblemsArray;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr= {2,4,3,4,4,6,4,7,4,4,4};
        int ans= getMajorityElement(arr);
        System.out.println(ans);

    }
    public static int getMajorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value= map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);

        }
        // iterating the hashmap
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()>arr.length/2){
                return it.getKey();
            }
        }
        return -1;
    }
}
