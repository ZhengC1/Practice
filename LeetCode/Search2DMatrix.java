class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int j = 0; j < matrix[row].length; j++) {
                if (matrix[row][j] > target) {
                    continue;
                }
                if (matrix[row][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
