class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
    

        int n = words.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            // if target found
            if (words[i].equals(target)) {

                // clockwise distance
                int right = Math.abs(i - startIndex);

                // counter-clockwise distance
                int left = n - right;

                // minimum circular distance
                ans = Math.min(ans, Math.min(right, left));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
} 
    