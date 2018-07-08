public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        String pal = "racecar";
        String notPal = "chunzheng";

        System.out.println(p.isPalindrome(pal));
        System.out.println(p.isPalindrome(notPal));
    }
    
    public boolean isPalindrome(String s) {
        if (s.length() <= 2) {
            return s.charAt(0) == s.charAt(s.length() - 1);
        }
        return s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, s.length() - 1 ));
    }
}
