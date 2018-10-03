public class BooleanNull {

    public static void main(String[] args) {
        String s = "this is a test";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxStart = 0;
        int maxEnd = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                System.out.println(dp[j+1][j + i - 1]);
                if (i == 0 || (s.charAt(j) == s.charAt(j + i) && (i == 1 || dp[j + 1][j + i - 1]))) {
                    dp[j][j + i] = true;
                    maxStart = j;
                    maxEnd = j + i;
                }
            }
        }    
    }
}
