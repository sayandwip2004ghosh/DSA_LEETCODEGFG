class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
     
        int n = nums.length;

        // store value + index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        long operations = n; // removing n elements
        int prevIndex = arr[0][1];

        for (int i = 1; i < n; i++) {
            int currIndex = arr[i][1];

            // if circular jump happens
            if (currIndex < prevIndex) {
                operations += (n - i);
            }

            prevIndex = currIndex;
        }

        return operations;
    }
}  
    