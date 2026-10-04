class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        int five = 0, ten=0;
        for(int bill: bills){
          if(bill==5) five++;
          if(bill==10) ten++;

          int change = bill-5;
          if(change==5){
            if(five>0){
                five--;
            }else{
                return false;
            }
          }else if(change==15){
            if(ten>0 && five>0){
                ten--;
                five--;
            }else if(five>2){
               five-=3;
            }else{
                return false;
            }
          }
        }
        return true;
    }
}