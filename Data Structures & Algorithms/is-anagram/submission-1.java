class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int sCountIndex = s.charAt(i) - 'a';
            int tCountIndex = t.charAt(i) - 'a';

            counts[sCountIndex] += 1;
            counts[tCountIndex] -= 1;
        }

        for (int count: counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
