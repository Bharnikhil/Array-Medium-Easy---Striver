package StriverArrays;

import java.util.ArrayList;

public class RearrangeEleposnegUnequal {
    public static void main(String[] args) {

    }
    void rearrange(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Step 1: Separate positive and negative elements
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        arr.clear(); // clear the original list

        int i = 0, j = 0;

        // Step 2: Alternate elements from pos and neg
        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }

        // Step 3: Add remaining positives
        while (i < pos.size()) {
            arr.add(pos.get(i++));
        }

        // Step 4: Add remaining negatives
        while (j < neg.size()) {
            arr.add(neg.get(j++));
        }
    }
}
