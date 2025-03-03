class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength= matrix.length;
        int colLength = matrix[0].length - 1;
        int col= colLength;
        int row=0;
        while(row < rowLength && col >= 0){
            // System.out.print(row+ " ropw , col " + col+" .......");
            if(matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }

        }
        return false;
    }
}
    