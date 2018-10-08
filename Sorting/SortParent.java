public abstract class SortParent {
    protected int[] numbers = new int[]{10, 9, 8, 7 , 6 , 5 , 4 , 3, 2, 1 };
    protected int n = numbers.length;

    public void printArray() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
