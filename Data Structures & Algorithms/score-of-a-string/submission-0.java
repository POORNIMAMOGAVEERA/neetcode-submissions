class Solution {
    public int scoreOfString(String s) {
        int prev= 0, sum = 0;
        for(char c:s.toCharArray()){
          int asci = c;
          System.out.println(asci);
          if(prev ==0){
            prev = asci;
            continue;
          }
          sum += Math.abs(prev-asci);
          prev = asci;
       } 
       return sum;
    }
}