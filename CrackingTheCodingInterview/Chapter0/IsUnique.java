import java.util.*;

/*
 * implement an algorithm to determine if a string has all unique characters. what if you cannot use
 * additional data structures?
 */
public class IsUnique {
    public static void main(String[] args) {

       String[] uniques = new String[]{
          "campground",
          "centigrams",
          "chairwomen",
          "championed",
          "charmingly",
          "chivalrous",
          "chlorinate",
          "clambering",
          "clampdowns",
          "clipboards",
          "clothespin",
          "clustering",
          "columbine",
          "Chun Zheng",
          "wolverine",
          "captain marvel",
          "captain america",
          "thor odinson",
          "the incredible hulk"
       };

       for(String word: uniques) {
           System.out.println(word + " is " + (unique(word)? "unique" : " not unique"));
       }
    }

    public static boolean unique(String word) {
        int[] characters = new int[256];
        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) word.charAt(i);
            if (characters[ascii] != 0) {
                return false;
            }
            characters[ascii] = 1;
        }
        return true;
    }
}
