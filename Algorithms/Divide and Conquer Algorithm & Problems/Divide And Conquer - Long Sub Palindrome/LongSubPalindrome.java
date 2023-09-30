public class LongSubPalindrome {

    private int findLPS(String s, int startIndex, int lastIndex) {
        if (startIndex > lastIndex) {
            return 0;
        }
        if(startIndex == lastIndex){
            return 1;
        }
        int count1 = 0;
        if (s.charAt(startIndex) == s.charAt(lastIndex)) {
            count1 = 2 + findLPS(s, startIndex + 1, lastIndex - 1);
        }

        int count2 = findLPS(s, startIndex + 1, lastIndex );
        int count3 = findLPS(s, startIndex , lastIndex - 1);
        return Math.max(count1, Math.max(count2,count3));
    }

    public int findLPS(String s) {
        return findLPS(s, 0, s.length()-1);
    }

}
