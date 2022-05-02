<<<<<<< HEAD
public class MergeSort 
	private int[] list;

	public MergeSort(int[] list) {
		this.list = list;
	}

	public int[] mergeSort() {
		int mid = this.list.length;
		
	}

	private int[] merge(int[] list1, int[] list2) {
	}
=======
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
>>>>>>> 04d8e2382fcc53bcc2d637ba142e60296811c011
}
