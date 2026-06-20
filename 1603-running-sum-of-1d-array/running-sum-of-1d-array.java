class Solution {
    public int[] runningSum(int[] arr) {
       int n =arr.length;
       int[] sum= new int[n];
       int k =0;
       for(int i=0;i<n;i++){
          if (i==0){
            sum[i]=arr[i];

          }
          else{
       
            int r =arr[i]+sum[i-1];
            
            sum[i]= r;
            
            }
            
           
        }
        return sum;
        
       
    }
}