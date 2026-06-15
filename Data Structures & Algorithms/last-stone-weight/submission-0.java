class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b)->b -a);

        for(int stone: stones){
            heap.add(stone);
        }
        while(heap.size()>1){
            int a= heap.poll();
            int b= heap.poll();
            if(a>b){
                heap.add(a-b);
            }
        }
        return heap.isEmpty()?0:heap.peek(); 
    }
}
