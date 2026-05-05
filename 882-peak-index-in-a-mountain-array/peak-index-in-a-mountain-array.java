class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=-1,high=arr.length-1,index=-1;
        int i;
        while(low < high){
            int mid=(low+high)/2;
            if (arr[mid] < arr[mid + 1]) {
                // increasing → move right
                low = mid + 1;
            } else {
                // decreasing → peak is here or left
                high = mid;
            }
        }

        return low; // or high (both same)
    }
}