/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.

Runtime: O(m+n)
-> At most take number of rows m + number of columns n
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length;
	    int col = matrix[0].length;
        //System.out.println(colSize);
        //System.out.println(rowSize);
        row --; col--;
        while (row > 0 && col >= 0){
            System.out.println(matrix[row][col]);
            if (matrix[row][col] == target) return true;
            if( target > matrix[row-1][col]){
                col--;
            }else{
                row--;
            }
        }
        while (row == 0 && col >= 0){
            if (matrix[row][col] == target) return true;
            col--;
        }
        return false;
    }   
}