// worst case O(n)^2
// best case O(n)
public class BubbleSort extends SortParent {
    public static void main(String[] args) {
        for(int i: ) {
            System.out.println(i);
        } 
    }
    public int[] main(String args[]) {
        int[] answers = numbers;
        for (int i = 0; i <  numbers.length(); i++) {
            for (int j = i + 1; j < numbers.length() - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    answers[j] = temp;
                }
            }
        }
      return answers; 
    }
}
