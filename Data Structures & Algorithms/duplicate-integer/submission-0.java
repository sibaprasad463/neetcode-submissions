class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> traverse = new HashSet<>();
        for(int i :nums){
            if(!traverse.add(i))
                return true;
        }
        return false;
    }
}