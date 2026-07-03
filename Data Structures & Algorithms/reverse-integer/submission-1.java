class Solution {
    public int reverse(int x) {
        long reverseNumber = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            x = x / 10;
        }        
        if (reverseNumber < Integer.MIN_VALUE || reverseNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reverseNumber;
    }
}
