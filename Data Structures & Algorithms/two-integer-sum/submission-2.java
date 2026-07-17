class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];

            if (resultMap.containsKey(minus)) {
                return new int[] { resultMap.get(minus), i };
            }

            resultMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
