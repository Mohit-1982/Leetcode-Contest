LC
  class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int swap = 0;
        
        while (i < j) {
            if (nums[i] == 0 && nums[j] != 0) {
                swap++;
                i++;
                j--;
            }
            if (nums[i] != 0) {
                i++;
            }
            if (nums[j] == 0) {
                j--;
            }
        }

        return swap;
    }
}©leetcode
