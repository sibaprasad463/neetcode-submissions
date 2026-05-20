class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();

        // put all numbers into set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // start only if num is beginning of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }
}
