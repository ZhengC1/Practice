import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
    }

    public int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int i,j,k = 0;
        System.out.println(i);
        System.out.println(k);
        System.out.println(j);
        return arr;

    }
}
