class Solution {
    public void rotate(int[][] matrix) {
        for (int i =0; i<matrix.length; i++) {
            for (int j=i; j<matrix.length; j++) {
                var temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i =0; i< matrix.length; i++) {
            var left = 0;
            var right = matrix.length - 1;
            while (left<right) {
                var temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    
    }
}
