import java.util.*;
public class InsertionSort extends SortParent {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        is.sort();
    }
    public int[] sort() {
        // so you start at the second index and loop forward
        for(int i = 1; i < n;i++) {
            // the index before i, so first iteration will be the first index
            int current_element = numbers[i];
            int j = i -1;
            // loops backwards and checks if the current index element is smaller than the ones before it.
            while(j >= 0 && current_element < numbers[j]) {
                // swapping
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                j--;
            }
        }
        return numbers;
    }
}
