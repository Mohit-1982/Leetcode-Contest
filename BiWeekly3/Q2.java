class Solution {
    static int res;
    public int countVisiblePeople(int n, int pos, int k) {
        char[] arr = new char[n];
        res = 0;
        helper(pos, k, 0, arr);
        return res % 1000000007;
    }
    public void helper(int pos, int k, int i, char[] arr) {
        if(i == arr.length) {
            int count = 0;
            for(int j = pos - 1; j >= 0; j--) {
                if(arr[j] == 'L') count++;
            }
            for(int j = pos + 1; j < arr.length; j++) {
                if(arr[j] == 'R') count++;
            }
            if(count == k) res += 1;
            return;
        }
        arr[i] = 'L';
        helper(pos, k, i + 1, arr);
        arr[i] = 'R';
        helper(pos, k, i + 1, arr);
    }
}©leetcode
