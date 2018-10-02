import java.util.*;

public class InsertionSort {
  public InsertionSort() {
  }

  interface Timer {
      void takeTime()

  }

  public static void main(String[] args) {
    // input  sequence of n numbers (a1, a2, ... a(n))
    // the numbers you want to sort are keys
    // output: sorted array i guess
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9, 32, 12314,1,6457,236,23,2,3,42,167,4,23,1));
    InsertionSort insertionSort = new InsertionSort();
    Function<String, String> personal = d -> insertionSort.personalInsertionSort(d);
    insertionSort.CLRSInsertionSort(nums);

    getTime(nums, InsertionSort::personalInsertionSort);
  }

  public static void getTime(Function<InsertionSort, ArrayList<Integer>> f, ArrayList<Integer> nums) {
    long startTime = System.nanoTime();
    for (InsertionSort s: l) {
      f.apply(s);
    }

    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) );
  }


  // I totally did this wrong on first breadth of the chapter
  public String personalInsertionSort(ArrayList<Integer> nums) {
    // sorts in place "apparently"
    long startTime = System.nanoTime();
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
    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) );
    return nums.toString();
  }

  // proper insertion
  public String CLRSInsertionSort(ArrayList<Integer> nums) {
    long startTime = System.nanoTime();
    if (nums.size() > 1) {
      for( int j = 1; j < nums.size(); j++) {
        Integer key = nums.get(j);
        int i = j -1;
        while (i > 0 && nums.get(i) > key) {
          nums.set(i + 1, nums.get(i));
          i = i -1;
        }
        nums.set(i + 1, key);
      }
    }
    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) );
    return nums.toString();
  }
}
