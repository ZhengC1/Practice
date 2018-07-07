class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        if (s.length() == 1) {
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String subString = s.substring(i, j);
                if (isUnique(subString)) longest = Math.max(longest, j - i);
            }
        }
        return longest;
    }

    public boolean isUnique(String subString) {
        int[] characters = new int[256];
        for(int i = 0; i < subString.length(); i++) {
            int index = (int)subString.charAt(i);
            if (characters[index] != 0) {
                return false;
            }
            characters[index] = 1;
        }
        return true;
    }
}
