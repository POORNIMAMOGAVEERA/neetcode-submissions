class KthLargest {
     PriorityQueue<Integer> stream;
     int k;
    public KthLargest(int k, int[] nums) {
        stream = new PriorityQueue<>((a,b)-> b -a);
        for(int i=0;i<nums.length;i++){
            stream.offer(nums[i]);
        }
        this.k = k;
    }
    
    public int add(int val) {
        stream.offer(val);
        int i=1;
        List<Integer> list = new ArrayList<>();
        while(i<k){
          list.add(stream.poll());
          i++;
        }
        int result = stream.peek();
        for(Integer elem: list){
            stream.offer(elem);
        }
        return result;
    }
}
