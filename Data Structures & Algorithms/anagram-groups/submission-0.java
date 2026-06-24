class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash = new HashMap<>();
        for(int i = 0; i<strs.length; i++) {
            var sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            hash.putIfAbsent(new String(sorted), new ArrayList<>());
            hash.get(new String(sorted)).add(strs[i]);
        }
        return new ArrayList<>(hash.values());
    }
}


