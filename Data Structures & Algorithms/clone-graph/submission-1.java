/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
     if(node == null) return null;
     Map<Node, Node> map = new HashMap<>();
     Queue<Node> queue = new LinkedList<>();
     Node copy = new Node(node.val);
     map.put(node, copy);
     queue.offer(node);
     while(!queue.isEmpty()){
        Node curr = queue.poll();
        for(Node neig: curr.neighbors){
            if(!map.containsKey(neig)){
               map.put(neig, new Node(neig.val)); 
               queue.offer(neig);
            }
            map.get(curr).neighbors.add(map.get(neig));
        }
     }
      return copy;
    }

}