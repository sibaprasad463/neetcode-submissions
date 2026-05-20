class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> decisionMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int negation = target-nums[i];
            if(decisionMap.containsKey(negation)){
                return new int[]{decisionMap.get(negation),i};
            }
            decisionMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
