/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.
*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        //sort each string (toCharArray)
        //group same ones together
        Map<String, List> anagrams = new HashMap<String, List>();
        
        for (String s: strs){
            char[] currChar = s.toCharArray();
            Arrays.sort(currChar);
            String key = String.valueOf(currChar);
            if (!anagrams.containsKey(key)){
                anagrams.put(key, new ArrayList());
            }
            anagrams.get(key).add(s);
        }
        return new ArrayList(anagrams.values());
    }
}