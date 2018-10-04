import java.util.*;
// worst case O(n) ^ 2
// best case O(n)
public class BubbleSort extends SortParent {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.sort();
    }

    /**
     * buble sort is n^2 at worst case
     * then it's n in it's best case
     */
    public int[] sort() {
        int[] answers = numbers;
        int n = numbers.length;
        for (int i = 0; i <  n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    printArray();
                }
            }
        }
        return answers;
    }
}
