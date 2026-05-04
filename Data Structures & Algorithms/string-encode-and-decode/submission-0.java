class Solution {

      // Encode list → string
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        
        return encoded.toString();
    }

    // Decode string → list
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            // Step 1: find delimiter '#'
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            
            // Step 2: parse length
            int length = Integer.parseInt(s.substring(i, j));
            
            // Step 3: extract string
            j++; // skip '#'
            String str = s.substring(j, j + length);
            result.add(str);
            
            // Move pointer
            i = j + length;
        }
        
        return result;
    }
}
