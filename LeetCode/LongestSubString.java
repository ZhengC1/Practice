import java.util.Set;
import java.util.HashSet;
class LongestSubString {
    public static void main(String[] args) {
        String test = "AU";
        String test1 = "ABCABCBB";
        LongestSubString lss = new LongestSubString();
        System.out.println(lss.lengthOfLongestSubstring(test));
        System.out.println(lss.lengthOfLongestSubstring(test1));
    }
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int longest = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while(i < len && j < len) {
            // if the set doesn't not contain the character at index j
            char current = s.charAt(j);
            if(!set.contains(current)) {
                //add the current character
                set.add(current);
                // increase window size to right
                j++;
                longest = Math.max(longest, j - i);
            } else {
                // decrease window size from left
                set.remove(current);
                i++;
            }
        }
        return longest;
    }
}
