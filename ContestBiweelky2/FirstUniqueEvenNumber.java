Contest : 
  class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }
            else
                map.put(nums[i], 1);
        }
        for(int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if(ele % 2 == 0 && map.get(ele) == 1) {
                return ele;
            }
        }
        return -1;
    }
}
