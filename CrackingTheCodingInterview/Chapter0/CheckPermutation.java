/**
 * given two strings, write a method to decide if one is a permutation of the other.
 */
import java.util.Arrays;
public class CheckPermutation {
    public static void main(String[] args) {
        CheckPermutation ck = new CheckPermutation();
        System.out.println(ck.permutates("kitten", "nettik"));
        System.out.println(ck.permutates("dog", "god"));
        System.out.println(ck.permutates("man", "cad"));
        System.out.println(ck.permutates("woman", "nam"));
    }

    public boolean permutates(String word, String secondWord) {
        return sortString(word).equals(sortString(secondWord));
    }

    public String sortString(String s) {
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
