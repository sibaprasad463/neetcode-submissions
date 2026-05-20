class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> decisionMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int neg = target-nums[i];
            if(decisionMap.containsKey(neg)){
                return new int[]{decisionMap.get(neg),i};
            }

            decisionMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
