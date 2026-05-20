class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> countMap = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) return false;
            countMap.put(c, countMap.get(c) - 1);
            if (countMap.get(c) == 0) countMap.remove(c);
        }

        return countMap.isEmpty();
    }
}
