import java.util.*;
public class SelectionSort extends SortParent {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.sort();
    }

    /**
     */
    public int[] sort() {
        int[] answers = numbers;
        int n = numbers.length;
        printArray();
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i; j < n; j++) {
                if (numbers[j] < numbers[min_index]) {
                    min_index = j;
                }
            }
            int temp = numbers[min_index];
            numbers[min_index] = numbers[i];
            numbers[i] = temp;
            printArray();
        }
        return answers;
    }
}
