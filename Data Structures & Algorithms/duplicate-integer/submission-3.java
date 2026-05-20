class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         return true;
        // }
        // return false;
        Set<Integer> traverse = new HashSet();
        for(int i:nums){
            if(traverse.add(i)==false)
                return true;
        }
        return false;
    }
}