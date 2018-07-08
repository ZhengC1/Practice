import java.util.*;
public class LongestSubStringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scan.nextLine();
        LongestSubStringPalindrome lssp = new LongestSubStringPalindrome();
        System.out.println(lssp.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        String longest = "";
        int len = s.length();
        for(int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String sub = "";
                if (j == len) {
                    sub = s.substring(i);
                } else {
                    sub = s.substring(i, j);
                }
                if (isPalindrome(sub)) {
                    if (longest.length() < sub.length()) {
                        longest = sub;
                    }
                }
            }
        }
        return longest;
    }

    public boolean isPalindrome(String s) {
       /**
        * if (s.length() <= 2) {
        *     return s.charAt(0) == s.charAt(s.length() - 1);
        * }
        * return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1));
        */
        int i = 0, j = s.length() - 1;
        while (j > i) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
