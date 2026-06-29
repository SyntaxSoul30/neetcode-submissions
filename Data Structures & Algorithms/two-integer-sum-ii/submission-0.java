class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var left = 0;
        var right = numbers.length - 1;
        int[] result = new int[2];
        while (left<right) {
            var sum = numbers[left] + numbers[right];
            if ((sum == target) && (numbers[left]!= numbers[right])) {
                result[0] = left+1;
                result[1] = right+1;
                return result;
            } else if(sum<target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[2];
    }
}
