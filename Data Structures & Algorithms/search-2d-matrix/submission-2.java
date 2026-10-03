class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length * matrix[0].length;
        int left = 0, right = n-1;
        int c = matrix[0].length;
        while(left <= right){
          int mid = left+ (right-left)/2;
          int row = mid/c, col = mid%c;
          if(matrix[row][col]==target){
            return true;
          }else if(matrix[row][col]<target){
            left = mid+1;
          }else{
            right = mid-1;
          }
        }
        return false;
    }
}
