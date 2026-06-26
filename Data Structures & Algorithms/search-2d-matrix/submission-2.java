class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //optimal
        var rows = matrix.length;
        var columns = matrix[0].length;
        var low = 0;
        var high = (rows*columns)-1;
        while(low<=high) {
            var mid = (low+high)/2;
            var midRow = mid/columns;
            var midColumn = mid%columns;
            var ele = matrix[midRow][midColumn];
            if(ele==target) {
                return true;
            } else if(ele<target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }
}
