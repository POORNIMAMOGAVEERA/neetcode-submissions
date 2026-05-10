class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> stack = new Stack<>();
       int j=0 ;
       int[] result = new int[temperatures.length];
       for(int i=0;i<temperatures.length;i++){
         int count =0;
         j=i;
         while(j<temperatures.length){
            if(!stack.isEmpty()&& temperatures[i]<temperatures[j]){
                result[i] = count;
                stack.clear();
                break;
            }
            stack.push(temperatures[i]);
            count++;
            j++;
            }
         }
         return result;
       } 
    }
