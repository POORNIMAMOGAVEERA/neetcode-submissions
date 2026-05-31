class PrefixTree {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode(); 
    }

    public void insert(String word) {
       TrieNode curr = root;
       for(Character c: word.toCharArray()){
        int idx = c - 'a';
        if(curr.children[idx]==null){
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx];
       }
       curr.isWord = true;
    }

    public boolean search(String word) {
      TrieNode curr = root;
      for(Character c : word.toCharArray()){
        int idx = c - 'a';
        if(curr.children[idx]==null){
            return false;
        }
        curr = curr.children[idx];
      }
      return curr.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(Character c : prefix.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    } 
}
