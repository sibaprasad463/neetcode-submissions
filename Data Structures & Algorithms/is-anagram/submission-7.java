class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        // char[] sc = s.toCharArray();
        // char[] tc = t.toCharArray();

        // Arrays.sort(sc);
        // Arrays.sort(tc);

        // return Arrays.equals(sc,tc);

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character,Integer> count = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            count.put(c1, count.getOrDefault(c1, 0) + 1);
            count.put(c2, count.getOrDefault(c2, 0) - 1);
        }

        for (int freq : count.values()) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    


    }
}
