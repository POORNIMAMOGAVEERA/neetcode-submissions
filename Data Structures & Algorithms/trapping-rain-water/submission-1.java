class Solution {
    public int trap(int[] height) {
        if(height.length<3) return 0;
        int n = height.length-2, max=0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0]=height[0];
        suffix[n-1]=height[n+1];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(height[i],prefix[i-1]);
           
        }
        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.max(height[i+2],suffix[i+1]);

        }
        int maxWater = 0, waterhold=0;
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+ " ");
            System.out.print(suffix[i]+ " ");
            waterhold = Math.min(prefix[i], suffix[i])-height[i+1];
            if(waterhold > 0){
               maxWater += waterhold;
            }
        }
        return maxWater;
    }
}
