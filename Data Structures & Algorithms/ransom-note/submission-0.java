class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var charArray = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            charArray[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            charArray[ransomNote.charAt(i) - 'a']--;
            if (charArray[ransomNote.charAt(i) - 'a']<0) return false;
        }

        return true;
    }
}