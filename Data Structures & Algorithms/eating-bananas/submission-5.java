class Solution {

    public int minEatingSpeed(int[] piles, int h) {
       int n = piles.length, result=Integer.MAX_VALUE; 
       int max_elem = 0;
       for(int pile:piles){
        max_elem = Math.max(max_elem, pile);
       }
       int left = 1, right = max_elem;
       while(left<=right){
         int mid = left+(right-left)/2;
         int total_hr=0;
         for(int pile:piles){
            total_hr+=(pile+mid-1)/mid;
         }
         if(total_hr<=h){
            result = Math.min(mid, result);
            right = mid-1;
         }else{
            left = mid+1;
         }
       }
       return result;
    }
}