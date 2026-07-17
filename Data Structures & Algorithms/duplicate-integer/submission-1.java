class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> resultSet = new HashSet<>();
        for(int i:nums){
            if(!resultSet.add(i)){
                return true;
            }
        }
        return false;
    }
}