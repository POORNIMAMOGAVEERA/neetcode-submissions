class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
        
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key, value);
            return;
        }
        if(map.size()==capacity){
          int lruKey = map.keySet().iterator().next();
          map.remove(lruKey);
        }

        map.put(key, value);
    }
}
