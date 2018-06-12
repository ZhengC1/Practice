import java.util.*;

public class InsertionSort {

  public static void main(String[] args) {
    // input  sequence of n numbers (a1, a2, ... a(n))
    // the numbers you want to sort are keys
    // output: sorted array i guess
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9, 32, 12314,1,6457,236,23,2,3,42,167,4,23,1));
    insertionSort(nums);

    // sorts in place "apparently"
    int len = nums.size();
    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len; j++) {
        if (nums.get(i) > nums.get(j)) {
          Integer temp = nums.get(i);
          nums.set(i, nums.get(j));
          nums.set(j, temp);
        }
      }
    }
    System.out.println(nums.toString());

  }
}
