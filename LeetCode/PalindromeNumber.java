public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindromeNumber(121));
    }

    public boolean isPalindromeNumber(int n) {
       String cat = Integer.toString(n);
       System.out.println(cat);
       int len = cat.length();
       for (int i = 0; i < cat.length() / 2; i++) {
           if (cat.charAt(i) != cat.charAt(len - 1)) {
               return false;
           }
           len--;
       }
       return true;
    }
}
