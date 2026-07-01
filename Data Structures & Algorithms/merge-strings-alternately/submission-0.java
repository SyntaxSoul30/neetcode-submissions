class Solution {
    public String mergeAlternately(String word1, String word2) {
        var ptr1 = 0;
        var ptr2 = 0;
        var result = new StringBuilder("");
        while (ptr1<word1.length() && ptr2<word2.length()) {
            result.append(word1.charAt(ptr1));
            result.append(word2.charAt(ptr2));
            ptr1++;
            ptr2++;
        }
        while (ptr1<word1.length()) {
            result.append(word1.charAt(ptr1));
            ptr1++;
        }
        while (ptr2<word2.length()) {
            result.append(word2.charAt(ptr2));
            ptr2++;
        }
        return result.toString();   
    }
}