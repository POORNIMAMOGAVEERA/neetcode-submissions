class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> result = new ArrayList<>(); 
       for(int i=0;i<strs.length;i++){
        if(strs[i].equals("*"))continue;
        String s1 = strs[i];
        char[] sortAnagram1 = s1.toCharArray();
        List<String> list = new ArrayList<>();
        list.add(s1);
        strs[i] =new String("*"); 
        for(int j=0;j<strs.length;j++){
            if(i==j || strs[j].equals("*")) continue;
            String s2 = strs[j];
            char[] sortAnagram2 = s2.toCharArray();
            Arrays.sort(sortAnagram1);
            Arrays.sort(sortAnagram2);
            if(Arrays.equals(sortAnagram1, sortAnagram2)){
               list.add(s2);
               strs[j]=new String("*");;
            }
        }
        result.add(list);
       }
       return result;
    }
}
