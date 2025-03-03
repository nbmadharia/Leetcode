class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = -1; 
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                a = i;
                break; 
            }
        }

       
        if (a == -1) return false;

        
        for (int j = 0; j < matrix[a].length; j++) {
            if (matrix[a][j] == target) {
                return true; 
            }
        }

        return false; 
    }
}
