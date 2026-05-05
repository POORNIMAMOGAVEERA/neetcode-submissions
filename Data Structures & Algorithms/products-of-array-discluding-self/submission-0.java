class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, product_prefix=1, product_suffix=1;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++){
            product_prefix *= nums[i-1];
            prefix[i] = product_prefix;
        }
        for(int i=n-2;i>=0;i--){
            product_suffix *= nums[i+1];
            suffix[i] = product_suffix;
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
          result[i] = prefix[i]* suffix[i];
        }
        return result;
    }
}  
