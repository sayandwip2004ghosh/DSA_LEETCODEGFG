class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {

        int MOD = 1000000007;

        // process each query
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];

            for (int i = l; i <= r; i += k) {
                nums[i] = (int)((long)nums[i] * v % MOD);
            }
        }

        // compute XOR
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}