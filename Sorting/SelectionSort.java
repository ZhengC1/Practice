import java.util.*;
public class Selection extends SortParent {
    public static void main(String[] args) {
        SelectionSort bs = new SelectionSort();
        bs.sort();
    }

    /**
     * buble sort is n^2 at worst case
     * then it's n in it's best case
     */
    public int[] sort() {
        int[] answers = numbers;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                if (
            }
        }
        return answers;
    }
}
