Brute : 
  class Solution {
    public int minCost(int[][] grid) {
        int[] arr = new int[1];
        arr[0] = Integer.MAX_VALUE;
        helper(grid, 0, 0, arr, 0);
        return arr[0];
    }
    public void helper(int[][] arr, int row, int col, int[] res, int tempAns) {
        if(row >= arr.length || col >= arr[0].length) return;
        if(row == arr.length - 1 && col == arr[0].length - 1) {
            tempAns ^= arr[row][col];
            res[0] = Math.min(res[0], tempAns);
            return;
        }
        helper(arr, row + 1, col, res, tempAns ^ arr[row][col]);
        helper(arr, row, col + 1, res, tempAns ^ arr[row][col]);
    }
}©leetcode
Better : 
    
