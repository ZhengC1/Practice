/**
 * write a method to replace all spaces in a string with '%20'. You may assume that the string has
 * sufficient space at the end to hold all the additional characters, and that you are given the
 * 'true' * length of the string. (Note: if implementing in java, please use a character array so that you
 * can perform this operation in place.)
 */
public class URLify {
    public static void main(String[] args) {
      String input = "Mr John Smith    ";
      URLify uf = new URLify();
      System.out.println(uf.doTheThing(input));
    }

    /**
     * has to be a in place operation sadly
     */
    public String doTheThing(String words) {
        char[] word = words.toCharArray();
        int i = word.length - 1;
        while (word[i] == ' ') {
            i--;
        }
        for (int j = word.length -1; j >= 0; j--) {
            if (word[i] == ' ') {
                word[j--] = '0';
                word[j--] = '2';
                word[j--] = '%';
                i--;
            }
            word[j] = word[i];
            i--;
        }
        return new String(word);
    }

}
