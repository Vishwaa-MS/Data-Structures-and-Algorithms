public class LongestCommonSS {
    private int findLCS(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length() || i2 == s2.length()) {
            return 0;
        }
        int c1 = 0;
        if (s1.charAt(i1) == s2.charAt(i2)) {
            c1 = 1 + findLCS(s1, s2, i1 + 1, i2 + 1);
        }
        int c2 = findLCS(s1, s2, i1, i2 + 1);
        int c3 = findLCS(s1, s2, i1 + 1, i2);
        return Math.max(c1, Math.max(c2, c3));
    }

    public int findLCSLength(String s1, String s2) {
        return findLCS(s1, s2, 0, 0);
    }
}
