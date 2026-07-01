class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        var left = 0;
        var right = people.length -1;
        var resultBoats = 0;

        while (left<=right) {
            var sum = people[left] + people[right];
            if(sum <= limit) {
                left++;
            }
            right--;
            resultBoats++;
        }
        return resultBoats;
    }
}