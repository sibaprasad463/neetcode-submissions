class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{
                count=0;
            }
            if(count+1>nums.length/2){
                return nums[i];
            }
        }
        return nums[0];
    }
}