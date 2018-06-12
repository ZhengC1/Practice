import java.util.*;

public class InsertionSort {

  public static void main(String[] args) {
    // input  sequence of n numbers (a1, a2, ... a(n))
    // the numbers you want to sort are keys
    // output: sorted array i guess
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(9, 32, 12314,1,6457,236,23,2,3,42,167,4,23,1));
    System.out.println(personatlInsertionSort(nums));
    System.out.println(CLRSInsertionSort(nums));
  }


    // I totally did this wrong on first breadth of the chapter
    private String personalInsertionSort(ArrayList<Integer> nums) {
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

      return nums.toString();
    }

    // proper insertion
    private String CLRSInsertionSort(ArrayList<Integer> nums) {
      for( int j = 1; j < nums.size(); j++) {
        key = nums.get(j);
        int i = j -1;
        while (i > 0 && nums.get(i) > key) {
          nums.get(i + 1) = nums.get(i);
          i = i -1;
        }
        nums.get(i + 1) = key;
      }

      return nums.toString();
    }

    private String personalIntepretationSort(ArrayList<Integer> cards) {
      int numberOfCards = cards.size();
      for(cardsOnTable = 2; cardsOnTable < numberOfCards; cardsOnTable++) {
        cardInLeftHand = cards[cardsOnTable];

        cardInRightHand = cardsOnTable - 1;

        while (cardInRightHand > 0 && card.get(cardInRightHand) > cardInLeftHand) {
          cards.get(cardInLeftHand + 1) = card.get(cardInLeftHand);
          cardInLeftHand = cardInLeftHand - 1;
        }
        cards.get(cardInRightHand) = cardInLeftHand;

      }
    }
  }
}
