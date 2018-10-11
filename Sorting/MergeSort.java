import java.util.*;
public class MergeSort extends SortParent {

    private int length;
    private int[] arr;
    private int[] tempArr;

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.sort();
    }

    /**
    */
    public int[] sort() {
        this.length = numbers.length;
        this.arr = numbers;
        int[] tempArr = new int[length];
        mergeSort(0, length -1);
        return numbers;
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // do the left side
            mergeSort(lowerIndex, middle);
            // do the right side
            mergeSort(middle + 1, higherIndex);
            // merge those parts together
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArr[i] = arr[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }
}
