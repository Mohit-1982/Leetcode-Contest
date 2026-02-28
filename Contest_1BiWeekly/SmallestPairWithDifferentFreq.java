Leetcode - //
  class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        if(n == 1) return arr;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }else {
                map.put(nums[i], 1);
            }
        }
        int x = Integer.MAX_VALUE;
        for(int ele : map.keySet()) {
            if(ele < x) x = ele;
        }
        int y = Integer.MAX_VALUE;
        for(int ele : map.keySet()) {
            if(ele > x && map.get(ele) != map.get(x)) {
                if(ele < y) y = ele;
            }
        }
        if(x == Integer.MAX_VALUE || y == Integer.MAX_VALUE) return arr;
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
}©leetcode
