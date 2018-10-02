import java.util.HashMap;
import java.util.Map;
public class LongestSubString {
  public static void main(String[] args) {
    
  }

  // "abcabbc" -> "abc"
  //  "thisisatriumph" 
  public int solution(String s) {
      String longest = "";
      Map<String, Integer>  wordMap = new HashMap<>();
      if(s.length() < 2) {
          return 1;
      }
      for (int i = 0; i < s.length(); i++) {
          for (int j = i + 1; j < s.length(); j++) {
              String sub = s.subString(i, j);
          }
      }
  }
}
